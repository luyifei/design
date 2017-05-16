package com.design.memento.best;

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
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento) memento).getState());
    }

    private class Memento implements IMemento {
        private String state = "";

        public Memento(String state) {
            this.state = state;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }

}
