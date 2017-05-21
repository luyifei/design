package com.design.bridge.proto;

/**
 * 具体实现化角色
 * 
 * @author User
 *
 */
public class ConcreteImplementor1 implements Implementor {

    @Override
    public void doSomething() {
        System.out.println("doSomething[ConcreteImplementor1]...");
    }

    @Override
    public void doAnything() {
        System.out.println("doAnything[ConcreteImplementor1]...");
    }

}
