package com.design.proxy.force;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		player.login("zhangsan", "123456");
		player.killboss();
		player.upgrade();
		IGamePlayer proxy = player.getProxy();
		proxy.login("zhangsan", "123456");
		proxy.killboss();
		proxy.upgrade();

		player.login("zhangsan", "123456");
		player.killboss();
		player.upgrade();

		// 强制代理
		// 1.代理类由具体类创建
		// 2.创建代理类时，需要把具体类作为入参，指定代理的具体对象
		// 3.直接访问具体类方法会被拒绝
		// 4.需要通过具体类指定的代理类来访问具体类的方法(具体类有一个代理类的数据，代理类也有一个具体类的属性，相互绑定)
		// 5.具体类方法被调用时，使用isProxy()方法判断是否来自代理类调用
	}
}
