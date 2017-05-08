package com.design.adapter.clz.proto;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.Request();
        Target concreteTar = new ConcreteTarget();
        concreteTar.Request();
    }
}
