package com.design.memento.best;

/**
 * ����¼����Ա��ɫ
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
