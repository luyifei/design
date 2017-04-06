package com.design.singleton;

public class Emperor {
	private static final Emperor emperor = new Emperor();
	private Emperor(){
		
	}
	public static Emperor getInstance(){
		return emperor;
	}
	public void say(){
		System.out.println("Œ“æÕ «ª µ€...");
	}
}
