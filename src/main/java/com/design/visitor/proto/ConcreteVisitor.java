package com.design.visitor.proto;

/**
 * ��������� 
 * ��ͬ�ķ����߿��Զ�Ԫ�����Խ��в�ͬ��ҵ���߼�����
 * 
 * @author User
 *
 */
public class ConcreteVisitor implements IVisitor {
    private Integer totalScore = 0;

    @Override
    public void visit(ConcreteElement1 e1) {
        e1.doSomething();
        // ��ȡԪ�ص����ԣ���ͳ��
        totalScore++;
    }

    @Override
    public void visit(ConcreteElement2 e2) {
        e2.doSomething();
        // ��ȡԪ�ص����ԣ���ͳ��
        totalScore = totalScore + 2;
    }

    @Override
    public Integer getTotalScore() {
        return totalScore;
    }

}
