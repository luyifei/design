package com.design.proxy.dynamicV2;

public class RealSubject implements Subject {
	//ҵ�����
    @Override
    public void doSomething() {
        System.out.println("doing...");
    }

}
