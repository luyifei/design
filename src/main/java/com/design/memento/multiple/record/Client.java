package com.design.memento.multiple.record;

public class Client {

    public static void main(String[] args) {
        // ά������汾�ı���¼ģʽ
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("before...");
        System.out.println("ԭʼ״̬��" + originator.getState());
        caretaker.setMemento("1", originator.createMemento());
        originator.setState("after");
        System.out.println("version:1״̬��" + originator.getState());
        caretaker.setMemento("2", originator.createMemento());
        originator.setState("after2");
        System.out.println("version:2״̬��" + originator.getState());
        originator.restoreMemento(caretaker.getMemento("1"));
        System.out.println("�ָ�version:1״̬��" + originator.getState());
        originator.restoreMemento(caretaker.getMemento("2"));
        System.out.println("�ָ�version:2״̬��" + originator.getState());
    }

}
