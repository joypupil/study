package com.joypupil.study.test.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
    	try {
			currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}