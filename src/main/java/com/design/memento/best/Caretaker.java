package com.design.memento.best;

/**
 * 备忘录管理员角色
 * 
 * @author User
 *
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }

}
