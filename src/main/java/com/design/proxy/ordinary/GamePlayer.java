package com.design.proxy.ordinary;

/**
 * 具体主题类
 * 
 * @author sunny
 *
 */
public class GamePlayer implements IGamePlayer {

	public String name = "";

	public GamePlayer(IGamePlayer _gamePlyaer, String _name) throws Exception {
		if (_gamePlyaer == null) {
			//判断是否存在代理类
			throw new Exception();
		} else {
			this.name = _name;
		}
	}

	@Override
	public void login(String username, String password) {
		System.out.println("用户名：" + username + " 姓名：" + name);
	}

	@Override
	public void killboss() {
		System.out.println(name + " 打败BOSS");

	}

	@Override
	public void upgrade() {
		System.out.println(name + " 升级");
	}

}
