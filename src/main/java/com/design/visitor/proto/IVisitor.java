package com.design.visitor.proto;

/**
 * ���������
 * 
 * @author User
 *
 */
public interface IVisitor {
    // ���Է�����Щ����
    public void visit(ConcreteElement1 e1);

    public void visit(ConcreteElement2 e2);

    /**
     * �������Է��ʶ�������ԣ�����������ͳ�Ʒ��ʹ�Ԫ�ص�����
     * 
     * @return
     */
    public Integer getTotalScore();
}
