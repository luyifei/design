package com.design.factory.method;

public abstract class Creator {
	/**
	 * ͨ��ΪString,Enum,Class�ȣ���ȻҲ����Ϊ�� 
	 * @param clz
	 * @return
	 */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
