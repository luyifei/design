package com.design.visitor.proto;

/**
 * ����Ԫ��
 * @author User
 *
 */
public abstract class Element {
    //����ҵ���߼�
    public abstract void doSomething();
    //����˭������
    public abstract void accept(IVisitor visitor);
}
