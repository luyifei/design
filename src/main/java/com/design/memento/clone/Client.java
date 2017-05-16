package com.design.memento.clone;

public class Client {
    public static void main(String[] args) {
        // 利用克隆方法实现备忘录,容易出现克隆问题
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("原始状态");
        System.out.println("原始状态是：" + originator.getState());
        caretaker.setOriginator(originator.createMemento());
        originator.setState("修改后状态");
        System.out.println(caretaker.getOriginator().getState());
        System.out.println("修改状态是：" + originator.getState());
        originator.restoreMemento(caretaker.getOriginator());
        System.out.println("还原后状态：" + originator.getState());
    }
}
