package com.design.lsp;

import java.util.Collection;
import java.util.Map;

public class Father {
	public Collection<Object> doSomething(Map<Object, Object> map) {
		System.out.println("���౻ִ�С�����");
		return map.values();
	}
}
