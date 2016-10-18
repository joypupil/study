package com.joypupil.study.test.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{
	private String oid; 

    MyCallable(String oid) { 
            this.oid = oid; 
    } 

    @Override 
    public String call() throws Exception { 
    	Thread.sleep(10000);
    	return Thread.currentThread().getName() + oid+"任务返回的内容"; 
    } 
}
