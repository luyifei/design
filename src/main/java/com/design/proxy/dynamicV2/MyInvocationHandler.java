package com.design.proxy.dynamicV2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    //被代理对象
    private Object obj = null;
    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }
    //代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理方法
        return method.invoke(obj, args);
    }

}
