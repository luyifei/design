package com.design.proxy.ordinary;

/**
 * 抽象主题类
 * @author sunny
 *
 */
public interface IGamePlayer {
	public void login(String username,String password);
	
	public void killboss();
	
	public void upgrade();
}
