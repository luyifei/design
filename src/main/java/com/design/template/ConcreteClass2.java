package com.design.template;

public class ConcreteClass2 extends AbstractClass {
	private boolean hook = false;;
	
	public void setHook(boolean hook){
		this.hook = hook;
	}
	public void doSomething() {
		System.out.println("class2...some...");
	}

	public void doAnything() {
		System.out.println("class2...any...");
	}
	
	public boolean isHook() {
		return hook;
	}
}
