package com.joypupil.study.design_pattern._06proxy.aop;

public class RealSubject implements Subject {

    //业务操作
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
