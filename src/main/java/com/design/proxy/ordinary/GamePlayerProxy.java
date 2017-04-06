package com.design.proxy.ordinary;

/**
 * ����������
 * 
 * @author sunny
 *
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
	private GamePlayer gamePlayer = null;

	public GamePlayerProxy(String name) {
		try {
			this.gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void login(String username, String password) {
		gamePlayer.login(username, password);
	}

	@Override
	public void killboss() {
		this.before();
		gamePlayer.killboss();
		this.after();
	}

	@Override
	public void upgrade() {
		gamePlayer.upgrade();
		this.count();
	}

	public void before() {
		System.out.println("����װ��");
	}

	public void after() {
		System.out.println("ʰȡװ��");
	}

	@Override
	public void count() {
		System.out.println("��һ�����Ǯ��");
	}

}
