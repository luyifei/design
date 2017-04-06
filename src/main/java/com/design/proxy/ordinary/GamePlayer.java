package com.design.proxy.ordinary;

/**
 * ����������
 * 
 * @author sunny
 *
 */
public class GamePlayer implements IGamePlayer {

	public String name = "";

	public GamePlayer(IGamePlayer _gamePlyaer, String _name) throws Exception {
		if (_gamePlyaer == null) {
			//�ж��Ƿ���ڴ�����
			throw new Exception();
		} else {
			this.name = _name;
		}
	}

	@Override
	public void login(String username, String password) {
		System.out.println("�û�����" + username + " ������" + name);
	}

	@Override
	public void killboss() {
		System.out.println(name + " ���BOSS");

	}

	@Override
	public void upgrade() {
		System.out.println(name + " ����");
	}

}
