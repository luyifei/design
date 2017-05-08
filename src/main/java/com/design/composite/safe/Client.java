package com.design.composite.safe;

/**
 * 组合模式 -- 安全模式
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    /**
     * 
     * @param composite
     *            此处无法使用Component，因为父类没有getChildrenList()方法
     */
    public static void display(Composite composite) {
        for (Component c : composite.getChildrenList()) {
            if (c instanceof Leaf) {
                // 叶子节点
                c.doSomething();
            } else {
                // 此处与依赖倒置原则冲突（父类强转为子类）
                display((Composite) c);
            }
        }
    }
}
