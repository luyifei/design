package com.design.proxy.force;

public interface IGamePlayer {
	public void login(String username, String password);

	public void killboss();

	public void upgrade();

	/**
	 * 获取代理
	 */
	public IGamePlayer getProxy();
}
