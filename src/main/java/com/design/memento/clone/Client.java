package com.design.memento.clone;

public class Client {
    public static void main(String[] args) {
        // ���ÿ�¡����ʵ�ֱ���¼,���׳��ֿ�¡����
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("ԭʼ״̬");
        System.out.println("ԭʼ״̬�ǣ�" + originator.getState());
        caretaker.setOriginator(originator.createMemento());
        originator.setState("�޸ĺ�״̬");
        System.out.println(caretaker.getOriginator().getState());
        System.out.println("�޸�״̬�ǣ�" + originator.getState());
        originator.restoreMemento(caretaker.getOriginator());
        System.out.println("��ԭ��״̬��" + originator.getState());
    }
}
