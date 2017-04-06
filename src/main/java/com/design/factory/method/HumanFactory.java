package com.design.factory.method;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> clz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("创建人出现异常...");
		}
		return (T) human;
	}

}
