package com.design.proxy.ordinary;

public class Client {
	public static void main(String[] args) {
		GamePlayerProxy proxy = new GamePlayerProxy("ս��");
		proxy.login("zhansan", "mima");
		proxy.killboss();
		proxy.upgrade();
		
		//��ͨ����
		//1.�ⲿ����ֻ��Ҫ������������󣬲���Ҫ�������������
		//2.������������ʱ��ͬʱ��������������Ϊ���ԣ�����������󴫸������࣬�ṩ�������๹��
		//3.�����๹��ʱ�ж��Ƿ��ɴ�������й���
	}
}
