package com.design.proxy.force;

public class GamePlayer implements IGamePlayer {
	private IGamePlayer proxy = null;
	private String name = "";

	public GamePlayer(String _name) {
		this.name = _name;
	}

	@Override
	public void login(String username, String password) {
		if (isProxy()) {
			System.out.println("用户名：" + username + " 姓名：" + name);
		} else {
			System.out.println("请用代理访问");
		}
	}

	@Override
	public void killboss() {
		if (isProxy()) {
			System.out.println(name + " 打败BOSS");
		}else{
			System.out.println("请用代理访问");
		}
	}

	@Override
	public void upgrade() {
		if(isProxy()){
			System.out.println(name + " 升级");
		}else{
			System.out.println("请用代理访问");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return proxy;
	}

	private boolean isProxy() {
		if (proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
