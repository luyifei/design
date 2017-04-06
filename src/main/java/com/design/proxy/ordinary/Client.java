package com.design.proxy.ordinary;

public class Client {
	public static void main(String[] args) {
		GamePlayerProxy proxy = new GamePlayerProxy("战三");
		proxy.login("zhansan", "mima");
		proxy.killboss();
		proxy.upgrade();
		
		//普通代理
		//1.外部方法只需要创建代理类对象，不需要创建具体类对象
		//2.构造代理类对象时，同时构造具体类对象作为属性，并把自身对象传给具体类，提供给具体类构造
		//3.具体类构造时判断是否由代理类进行构造
	}
}
