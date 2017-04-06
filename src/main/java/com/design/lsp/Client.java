package com.design.lsp;

import java.util.HashMap;

public class Client {
	public static void main(String[] args) {
		invoker();
	}
	public static void invoker(){
		Son f = new Son();
		//HashMap<Object, Object> map = new HashMap<Object, Object>();
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		f.doSomething(map);
	}
}
