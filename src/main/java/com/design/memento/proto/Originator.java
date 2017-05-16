package com.design.memento.proto;

/**
 * 发起人角色
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
     * 创建一个备忘录
     * 
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     * 
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

}
