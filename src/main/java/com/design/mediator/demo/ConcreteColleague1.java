package com.design.mediator.demo;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator meiator) {
        super(meiator);
    }
    //���з���
    public void selfMethod1(){
        //�����Լ���ҵ���߼�
    }
    //��������
    public void depMethod1(){
        //�����Լ���ҵ���߼�
        //�Լ����ܴ����ҵ���߼�,ί�и��н���
        this.meiator.doSomething2();
    }
    
}
