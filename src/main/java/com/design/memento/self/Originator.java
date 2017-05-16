package com.design.memento.self;

public class Originator implements Cloneable {
    private Originator backup;

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemento() {
        this.backup = this.clone();
    }

    public void restoreMemento() {
        if (this.backup == null) {
            System.out.println("不存在备份");
            return;
        }
        this.state = this.backup.getState();
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
