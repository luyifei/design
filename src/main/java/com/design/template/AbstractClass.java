package com.design.template;

public abstract class AbstractClass {
	public abstract void doSomething();

	public abstract void doAnything();
	
	public boolean isHook() {
		return true;
	}

	protected final void templateMethod() {
		this.doSomething();
		if(isHook()){
			this.doAnything();
		}
	}
}
