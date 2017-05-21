package com.design.state.proto;

/**
 * 环境角色 环境角色有两个不成文的约束：<BR/>
 * ● 把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。<BR/>
 * ● 环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。<BR/>
 * 
 * @author sunny
 *
 */
public class Context {
    public static ConcreteState1 concreteState1 = new ConcreteState1();
    public static ConcreteState2 concreteState2 = new ConcreteState2();

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        //把当前的环境通知到各个实现类中
        this.state.setContext(this);
    }

    public void doSomething1() {
        this.state.doSomething1();
    }

    public void doSomething2() {
        this.state.doSomething2();
    }
}
