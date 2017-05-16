package com.design.memento.multiple.state;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("1...before");
        originator.setState2("2...before");
        originator.setState3("3...before");
        System.out.println("ԭʼ״̬��" + originator.toString());
        caretaker.setMemento(originator.createMemento());
        originator.setState("1...after");
        originator.setState2("2...after");
        originator.setState3("3...after");
        System.out.println("�޸ĺ�״̬��" + originator.toString());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("��ԭ��״̬��" + originator.toString());

    }

}
