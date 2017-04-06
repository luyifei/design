package com.design.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		//限制产生多个对象
	}
	//通过该方法获得实例对象
	public static Singleton getInstance(){
		return singleton;
	}
	//类中其他方法，尽量使用static
	public static void doSomething(){
		System.out.println("doSomething...");
	}
}
