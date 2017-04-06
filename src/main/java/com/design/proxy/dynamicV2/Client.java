package com.design.proxy.dynamicV2;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        // ����һ������
        Subject subject = new RealSubject();
        // �����handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        // ��������Ĵ���
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        // ������Ϊ
        proxy.doSomething();
    }
}
