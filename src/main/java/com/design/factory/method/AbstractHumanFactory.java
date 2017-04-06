package com.design.factory.method;

public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> clz);
}
