package com.design.proxy.dynamicV2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {
    @SuppressWarnings("unchecked")
    public static <T> T newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler handler){
        //Ѱ��JoinPoint���ӵ㣬AOP���ʹ��Ԫ�ض���
        if(true){
            //ִ��һ��ǰ��֪ͨ
            (new BeforeAdvice()).exec();
        }
        //ִ��Ŀ�꣬�����ؽ��
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}


