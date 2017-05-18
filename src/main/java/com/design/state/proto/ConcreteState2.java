package com.design.state.proto;

public class ConcreteState2 extends State {

    @Override
    public void doSomething1() {
        // 决定是否可以过渡到其他状 态
        this.context.setState(Context.concreteState1);
        this.context.doSomething1();
    }

    @Override
    public void doSomething2() {
        // 本状态下必须处理的逻辑 
        System.out.println("ConcreteState2...doSomething2...");
    }

}
