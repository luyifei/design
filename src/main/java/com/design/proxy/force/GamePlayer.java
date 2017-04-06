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
			System.out.println("�û�����" + username + " ������" + name);
		} else {
			System.out.println("���ô������");
		}
	}

	@Override
	public void killboss() {
		if (isProxy()) {
			System.out.println(name + " ���BOSS");
		}else{
			System.out.println("���ô������");
		}
	}

	@Override
	public void upgrade() {
		if(isProxy()){
			System.out.println(name + " ����");
		}else{
			System.out.println("���ô������");
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
