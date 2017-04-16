package com.design.proxy.dynamicV3;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(Subject subject) {
        // ��ȡClassLoader��
        ClassLoader loader = subject.getClass().getClassLoader();
        // ��ȡ�ӿ�����
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        // ��ȡhandler
        InvocationHandler h = new MyInvocationHandler(subject);
        return (T) newProxyInstance(loader, interfaces, h);
    }
}
