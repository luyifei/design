package com.design.memento.multiple.state;

/**
 * 发起人角色
 * 
 * @author User
 *
 */
public class Originator {
    private String state = "";

    private String state2 = "";

    private String state3 = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    /**
     * 创建一个备忘录
     * 
     * @return
     */
    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    /**
     * 恢复一个备忘录
     * 
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getStateMap());
    }

    @Override
    public String toString() {
        return "Originator [state=" + state + ", state2=" + state2 + ", state3=" + state3 + "]";
    }

}
