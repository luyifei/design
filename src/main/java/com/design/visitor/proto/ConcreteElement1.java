package com.design.visitor.proto;

/**
 * ����Ԫ��
 * @author User
 *
 */
public class ConcreteElement1 extends Element {

    @Override
    public void doSomething() {
        System.out.println("ConcreteElement1....");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
