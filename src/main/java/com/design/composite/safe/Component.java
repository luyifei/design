package com.design.composite.safe;

/**
 * 抽象构件
 * @author User
 *
 */
public abstract class Component {
    private Component parent;

    public void doSomething() {
        // 个体和整体都具有的共享
        System.out.println("doSomething...");
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

}
