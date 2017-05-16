package com.design.visitor.proto;

/**
 * 访问者模式可以用于统计报表
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IVisitor visitor = new ConcreteVisitor();
        for (int i = 0; i < 10; i++) {
            // 获取元素对象
            Element e = ObjectStruture.getElement();
            // 接受访问者访问
            e.accept(visitor);
        }
        System.out.println(visitor.getTotalScore());
    }
}
