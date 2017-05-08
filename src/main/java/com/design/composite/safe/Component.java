package com.design.composite.safe;

/**
 * ���󹹼�
 * @author User
 *
 */
public abstract class Component {
    private Component parent;

    public void doSomething() {
        // ��������嶼���еĹ���
        System.out.println("doSomething...");
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

}
