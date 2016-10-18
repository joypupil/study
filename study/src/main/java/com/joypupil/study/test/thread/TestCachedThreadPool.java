package com.joypupil.study.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCachedThreadPool {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        //创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newCachedThreadPool();
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        Callable<String> c1 = new MyCallable("A");
        Callable<String> c2 = new MyCallable("B");
        //将线程放入池中进行执行
        Future<String> future = pool.submit(c1);
        System.err.println(future.get());
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        future = pool.submit(c2);
        System.err.println(future.get());
        //关闭线程池
        pool.shutdown();
    }

}
