package com.design.facade;

public class Context {
    public SubSystemClassA classA = new SubSystemClassA();
    public SubSystemClassB classB = new SubSystemClassB();
    
    public void doSomethingAB(){
        classA.doSomething();
        classB.doSomething();
    }
    
}
