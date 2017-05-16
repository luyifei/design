package com.design.visitor.proto;

/**
 * 抽象访问者
 * 
 * @author User
 *
 */
public interface IVisitor {
    // 可以访问哪些对象
    public void visit(ConcreteElement1 e1);

    public void visit(ConcreteElement2 e2);

    /**
     * 不仅可以访问对象的属性，还可以用于统计访问过元素的属性
     * 
     * @return
     */
    public Integer getTotalScore();
}
