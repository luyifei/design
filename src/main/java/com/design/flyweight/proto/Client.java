package com.design.flyweight.proto;

public class Client {
    public static void main(String[] args) {
        //��Ԫģʽ����ʹ�û���������Ϊ�ⲿ״̬�����Ч��
        String name = "����";
        String name2 = "����";
        Flyweight f1 = FlyweightFactory.getFlyweight(name);
        System.out.println(f1);
        Flyweight f2 = FlyweightFactory.getFlyweight(name);
        Flyweight f3 = FlyweightFactory.getFlyweight(name);
    }
}
