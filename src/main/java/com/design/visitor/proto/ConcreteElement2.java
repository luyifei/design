package com.design.visitor.proto;

/**
 * ����Ԫ��
 * @author User
 *
 */
public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        System.out.println("ConcreteElement2...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
