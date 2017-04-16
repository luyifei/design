package com.design.proxy.dynamicV3;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(Subject subject) {
        // 获取ClassLoader类
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获取接口数组
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        // 获取handler
        InvocationHandler h = new MyInvocationHandler(subject);
        return (T) newProxyInstance(loader, interfaces, h);
    }
}
