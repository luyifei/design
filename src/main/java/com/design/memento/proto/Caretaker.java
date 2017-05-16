package com.design.memento.proto;

/**
 * 备忘录管理员角色
 * 
 * @author User
 *
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
