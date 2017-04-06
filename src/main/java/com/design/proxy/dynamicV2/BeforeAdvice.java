package com.design.proxy.dynamicV2;

public class BeforeAdvice implements IAdvice {
    public void exec() {
        System.out.println("我是前置通知，我被执行了。");
    }

}
