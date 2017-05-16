package com.design.memento.best;

public class Client {

    public static void main(String[] args) {
        // 最好的方式是把备忘录类作为一个内部类，其他类无法修改其内容。
        // 对Caretaker我们可以抽象一个IMemento接口处理。这样就可以Caretaker就可以管理备忘录对象
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
