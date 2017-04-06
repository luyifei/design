package com.design.proxy.force;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("����");
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

		// ǿ�ƴ���
		// 1.�������ɾ����ഴ��
		// 2.����������ʱ����Ҫ�Ѿ�������Ϊ��Σ�ָ������ľ������
		// 3.ֱ�ӷ��ʾ����෽���ᱻ�ܾ�
		// 4.��Ҫͨ��������ָ���Ĵ����������ʾ�����ķ���(��������һ������������ݣ�������Ҳ��һ������������ԣ��໥��)
		// 5.�����෽��������ʱ��ʹ��isProxy()�����ж��Ƿ����Դ��������
	}
}
