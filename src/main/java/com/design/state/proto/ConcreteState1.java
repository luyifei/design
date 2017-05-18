package com.design.state.proto;

/**
 * 具体状态角色
 * 
 * @author sunny
 *
 */
public class ConcreteState1 extends State {

    @Override
    public void doSomething1() {
        // 当前状态能处理的业务逻辑
        System.out.println("ConcreteState1...doSomething1...");
    }

    @Override
    public void doSomething2() {
        // 转化到下个状态能够处理的逻辑
        this.context.setState(Context.concreteState2);
        this.context.doSomething2();
    }

}
