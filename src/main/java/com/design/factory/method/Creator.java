package com.design.factory.method;

public abstract class Creator {
	/**
	 * 通常为String,Enum,Class等，当然也可以为空 
	 * @param clz
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
