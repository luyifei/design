package com.design.visitor.proto;

/**
 * 具体访问者 
 * 不同的访问者可以对元素属性进行不同的业务逻辑处理
 * 
 * @author User
 *
 */
public class ConcreteVisitor implements IVisitor {
    private Integer totalScore = 0;

    @Override
    public void visit(ConcreteElement1 e1) {
        e1.doSomething();
        // 获取元素的属性，并统计
        totalScore++;
    }

    @Override
    public void visit(ConcreteElement2 e2) {
        e2.doSomething();
        // 获取元素的属性，并统计
        totalScore = totalScore + 2;
    }

    @Override
    public Integer getTotalScore() {
        return totalScore;
    }

}
