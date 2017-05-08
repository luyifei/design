package com.design.decorator.proto;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void method() {
        System.err.println("×°ÊÎÕß2...");
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }

}
