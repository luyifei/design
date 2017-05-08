package com.design.composite.transparent;

import java.util.ArrayList;

/**
 * ³éÏó¹¹¼ş
 * 
 * @author User
 *
 */
public abstract class Component {
    private Component parent;

    public void doSomething() {
        System.out.println("dosomething...");
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildrenList();

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

}
