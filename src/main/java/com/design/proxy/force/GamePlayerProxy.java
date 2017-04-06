package com.design.proxy.force;

public class GamePlayerProxy implements IGamePlayer {
	public IGamePlayer gamePlayer= null;
	public GamePlayerProxy(IGamePlayer _gamePlayer){
		this.gamePlayer = _gamePlayer;
	}
	
	@Override
	public void login(String username, String password) {
		this.gamePlayer.login(username, password);

	}

	@Override
	public void killboss() {
		this.gamePlayer.killboss();

	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();

	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
