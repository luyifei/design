package com.design.memento.clone;

/**
 * �ںϱ���¼�ķ����˽�ɫ
 * 
 * @author User
 *
 */
public class Originator implements Cloneable {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator createMemento() {
        return this.clone();
    }

    public void restoreMemento(Originator originator) {
        this.state = originator.getState();
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
