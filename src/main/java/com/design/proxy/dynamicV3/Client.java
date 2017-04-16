package com.design.proxy.dynamicV3;

public class Client {
    public static void main(String[] args) {
        //����һ��������
        Subject subject = new RealSubject();
        //��������Ĵ���
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //�������Ϊ
        proxy.doSomething();
    }
}
