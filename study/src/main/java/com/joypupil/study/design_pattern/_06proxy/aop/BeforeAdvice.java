package com.joypupil.study.design_pattern._06proxy.aop;

public class BeforeAdvice implements IAdvice {

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
