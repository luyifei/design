package com.design.decorator.proto;

public class ConcreteDecorator1 extends Decorator{
    
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    
    public void method(){
        System.out.println("×°ÊÎÕß1...");
    }
    
    @Override
    public void operate() {
        this.method();
        super.operate();
    }
}
