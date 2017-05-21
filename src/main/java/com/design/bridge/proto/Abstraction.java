package com.design.bridge.proto;

/**
 * ³éÏó»¯½ÇÉ«
 * 
 * @author User
 *
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        System.out.println("abstraction request...");
        this.implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }

}
