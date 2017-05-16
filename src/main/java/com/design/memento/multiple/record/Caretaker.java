package com.design.memento.multiple.record;

import java.util.HashMap;

/**
 * 备忘录管理员角色
 * 
 * @author User
 *
 */
public class Caretaker {
    private HashMap<String, Memento> mementos = new HashMap<>();

    public Memento getMemento(String version) {
        return mementos.get(version);
    }

    public void setMemento(String version, Memento memento) {
        this.mementos.put(version, memento);
    }

}
