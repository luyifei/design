package com.design.observe.proto;

public class ConcreteSubject extends Subject {

    public void dosomething() {
        System.out.println("dosomething...");
        super.notifyObservers();
    }
}
