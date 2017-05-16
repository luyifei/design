package com.design.memento.multiple.record;

/**
 * �����˽�ɫ
 * 
 * @author User
 *
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * ����һ������¼
     * 
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * �ָ�һ������¼
     * 
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

}
