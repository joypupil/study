package com.joypupil.study.test.序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

public class Client {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		TestSerializable test1 = new TestSerializable();
		test1.setTestA("测试1a");
		test1.setTestB("测试1b");
		TestSerializable test2 = new TestSerializable();
		test2.setTestA("测试2a");
		test2.setTestB("测试2b");
		TestSerializable test3 = new TestSerializable();
		test3.setTestA("测试3a");
		test3.setTestB("测试3b");
		List<TestSerializable> tests = new ArrayList<TestSerializable>();
		tests.add(test1);
		tests.add(test2);
		tests.add(test3);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./src/my.out"));
		out.writeObject(tests);
		out.flush();
		out.close();
		fan();
	}
	
	public static void fan()//反序列的过程
    {    
         ObjectInputStream oin = null;//局部变量必须要初始化
        try
        {
            oin = new ObjectInputStream(new FileInputStream("./src/my.out"));
        } catch (FileNotFoundException e1)
        {        
            e1.printStackTrace();
        } catch (IOException e1)
        {
            e1.printStackTrace();
        }      
        List<TestSerializable> mts = null;
        try {
            mts = (List<TestSerializable>) oin.readObject();//由Object对象向下转型为MyTest对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }    
        System.out.println(mts.size());
        for(TestSerializable testSerializable : mts){
        	System.err.println(testSerializable.getTestA());
        	System.err.println(testSerializable.getTestB());
        }
    }

}
