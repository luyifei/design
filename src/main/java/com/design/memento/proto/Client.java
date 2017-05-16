package com.design.memento.proto;

/**
 * 单一状态的单一备份
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("原始状态");
        System.out.println("原始状态是：" + originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("修改后状态");
        System.out.println("修改状态是：" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("还原后状态：" + originator.getState());

    }
}
