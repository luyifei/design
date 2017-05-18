package com.design.state.proto;

/**
 * ������ɫ ������ɫ�����������ĵ�Լ����<BR/>
 * �� ��״̬��������Ϊ��̬�������м���״̬���������������̬������<BR/>
 * �� ������ɫ����״̬�����ɫ�����������Ϊ������ִ��ʹ��ί�з�ʽ��<BR/>
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
        this.state.setContext(this);
    }

    public void doSomething1() {
        this.state.doSomething1();
    }

    public void doSomething2() {
        this.state.doSomething2();
    }
}
