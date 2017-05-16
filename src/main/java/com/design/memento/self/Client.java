package com.design.memento.self;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("ԭʼ״̬");
        System.out.println("ԭʼ״̬�ǣ�" + originator.getState());
        originator.createMemento();
        originator.setState("�޸ĺ�״̬");
        System.out.println("�޸�״̬�ǣ�" + originator.getState());
        originator.restoreMemento();
        System.out.println("��ԭ��״̬��" + originator.getState());
    }
}
