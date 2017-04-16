package com.design.proxy.dynamicV3;

public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("业务处理...");
    }

}
