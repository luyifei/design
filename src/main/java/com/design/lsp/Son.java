package com.design.lsp;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {
	public Collection<Object> doSomething(HashMap<Object, Object> map) {
		System.out.println("���౻ִ��...");
		return map.values();
	}
}
