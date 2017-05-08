package com.design.strategy.proto;

public class Client {
    public static void main(String[] args) {
        IStrategy strategy1 = new ConcreteStrategy1();
        Context context = new Context(strategy1);
        context.doSomething();
    }
}
