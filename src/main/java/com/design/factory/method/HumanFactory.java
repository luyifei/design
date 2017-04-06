package com.design.factory.method;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> clz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("�����˳����쳣...");
		}
		return (T) human;
	}

}
