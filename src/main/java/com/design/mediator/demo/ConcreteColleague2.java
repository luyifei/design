package com.design.mediator.demo;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator meiator) {
        super(meiator);
    }
    
    //���з���
    public void selfMethod2(){
        //���������ܴ�����߼�
    }
    //��������
    public void depMethod2(){
        //���������߼�
        //�������˵�ҵ���߼���ί�и��н��ߴ���
        this.meiator.doSomething1();
    }
}
