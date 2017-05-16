package com.design.memento.self;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("原始状态");
        System.out.println("原始状态是：" + originator.getState());
        originator.createMemento();
        originator.setState("修改后状态");
        System.out.println("修改状态是：" + originator.getState());
        originator.restoreMemento();
        System.out.println("还原后状态：" + originator.getState());
    }
}
