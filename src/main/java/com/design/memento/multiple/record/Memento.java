package com.design.memento.multiple.record;

/**
 * ����¼��ɫ
 * 
 * @author User
 *
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
