package com.design.flyweight.proto;

public class Client {
    public static void main(String[] args) {
        //享元模式建议使用基本类型作为外部状态，提高效率
        String name = "张三";
        String name2 = "李四";
        Flyweight f1 = FlyweightFactory.getFlyweight(name);
        System.out.println(f1);
        Flyweight f2 = FlyweightFactory.getFlyweight(name);
        Flyweight f3 = FlyweightFactory.getFlyweight(name);
    }
}
