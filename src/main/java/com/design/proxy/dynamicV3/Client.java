package com.design.proxy.dynamicV3;

public class Client {
    public static void main(String[] args) {
        //定义一个主题类
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething();
    }
}
