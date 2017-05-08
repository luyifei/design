package com.design.adapter.clz.proto;

public class ConcreteTarget implements Target {
    @Override
    public void Request() {
        System.out.println("ConcreteTarget---request....");
    }
}
