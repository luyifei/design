package com.design.visitor.proto;

/**
 * ������ģʽ��������ͳ�Ʊ���
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IVisitor visitor = new ConcreteVisitor();
        for (int i = 0; i < 10; i++) {
            // ��ȡԪ�ض���
            Element e = ObjectStruture.getElement();
            // ���ܷ����߷���
            e.accept(visitor);
        }
        System.out.println(visitor.getTotalScore());
    }
}
