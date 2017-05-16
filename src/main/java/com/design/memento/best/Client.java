package com.design.memento.best;

public class Client {

    public static void main(String[] args) {
        // ��õķ�ʽ�ǰѱ���¼����Ϊһ���ڲ��࣬�������޷��޸������ݡ�
        // ��Caretaker���ǿ��Գ���һ��IMemento�ӿڴ��������Ϳ���Caretaker�Ϳ��Թ�����¼����
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("ԭʼ״̬");
        System.out.println("ԭʼ״̬�ǣ�" + originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("�޸ĺ�״̬");
        System.out.println("�޸�״̬�ǣ�" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("��ԭ��״̬��" + originator.getState());

    }

}
