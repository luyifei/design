package com.design.observe.proto;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.saySomething();
    }
}
