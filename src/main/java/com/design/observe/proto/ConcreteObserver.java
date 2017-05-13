package com.design.observe.proto;

public class ConcreteObserver extends Observer {

    @Override
    public void update() {
        System.out.println("观察者的处理行为：ConcreteObserver...");
    }

}
