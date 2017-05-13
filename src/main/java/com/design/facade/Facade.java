package com.design.facade;

/**
 * �����ɫ
 * 
 * @author sunny
 *
 */
public class Facade {
    public SubSystemClassA classA = new SubSystemClassA();
    public SubSystemClassB classB = new SubSystemClassB();
    public Context context = new Context();

    public void doSomethingA() {
        this.classA.doSomething();
    }

    public void doSomethingB() {
        this.classB.doSomething();
    }

    public void doSomethingAB() {
        this.context.doSomethingAB();
    }
}
