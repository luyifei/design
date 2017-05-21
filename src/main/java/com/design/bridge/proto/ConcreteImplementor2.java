package com.design.bridge.proto;

public class ConcreteImplementor2 implements Implementor {
    @Override
    public void doSomething() {
        System.out.println("doSomething[ConcreteImplementor1]...");
    }

    @Override
    public void doAnything() {
        System.out.println("doAnything[ConcreteImplementor1]...");
    }

}
