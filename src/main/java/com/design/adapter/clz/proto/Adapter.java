package com.design.adapter.clz.proto;

public class Adapter extends Adaptee implements Target {
    @Override
    public void Request() {
        super.specificRequest();

    }
}
