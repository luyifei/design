package com.design.state.proto;

/**
 * ����״̬��ɫ
 * 
 * @author sunny
 *
 */
public class ConcreteState1 extends State {

    @Override
    public void doSomething1() {
        // ��ǰ״̬�ܴ����ҵ���߼�
        System.out.println("ConcreteState1...doSomething1...");
    }

    @Override
    public void doSomething2() {
        // ת�����¸�״̬�ܹ�������߼�
        this.context.setState(Context.concreteState2);
        this.context.doSomething2();
    }

}
