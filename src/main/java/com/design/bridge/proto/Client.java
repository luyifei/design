package com.design.bridge.proto;

public class Client {
    public static void main(String[] args) {
        Implementor con = new ConcreteImplementor2();
        Abstraction abs = new RefinedAbstraction(con);
        abs.request();
    }
}
