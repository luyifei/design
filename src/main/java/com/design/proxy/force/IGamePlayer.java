package com.design.proxy.force;

public interface IGamePlayer {
	public void login(String username, String password);

	public void killboss();

	public void upgrade();

	/**
	 * ��ȡ����
	 */
	public IGamePlayer getProxy();
}
