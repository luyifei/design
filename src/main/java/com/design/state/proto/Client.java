package com.design.state.proto;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.doSomething1();
        context.doSomething2();
    }
}
