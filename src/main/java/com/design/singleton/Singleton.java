package com.design.singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton(){
		//���Ʋ����������
	}
	//ͨ���÷������ʵ������
	public static Singleton getInstance(){
		return singleton;
	}
	//������������������ʹ��static
	public static void doSomething(){
		System.out.println("doSomething...");
	}
}
