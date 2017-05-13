package com.design.observe.demo;

public class Client {
    public static void main(String[] args) {
        Publish publish = new Publish();
        Subscribe subscribe = new Subscribe();
        publish.addObserver(subscribe);
        publish.doSomething();
    }
}
