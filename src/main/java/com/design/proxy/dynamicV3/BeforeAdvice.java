package com.design.proxy.dynamicV3;

public class BeforeAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("前置通知，被执行...");
    }

}
