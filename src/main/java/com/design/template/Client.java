package com.design.template;

public class Client {
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		ConcreteClass2 class2 = new ConcreteClass2();
		class2.setHook(true);
		class1.templateMethod();
		class2.templateMethod();
	}
}
