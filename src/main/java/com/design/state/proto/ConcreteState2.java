package com.design.state.proto;

public class ConcreteState2 extends State {

    @Override
    public void doSomething1() {
        // �����Ƿ���Թ��ɵ�����״ ̬
        this.context.setState(Context.concreteState1);
        this.context.doSomething1();
    }

    @Override
    public void doSomething2() {
        // ��״̬�±��봦����߼� 
        System.out.println("ConcreteState2...doSomething2...");
    }

}
