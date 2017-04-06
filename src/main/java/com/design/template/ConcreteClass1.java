package com.design.template;

public class ConcreteClass1 extends AbstractClass {
	public void doAnything() {
		System.out.println("class1...any...");
	}

	public void doSomething() {
		System.out.println("class1...some...");
	}
	
	public boolean isHook() {
		return false;
	}
}
