package com.design.composite.transparent;

/**
 * ���ģʽ--͸��ģʽ
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        display(root);
        
        Integer d = Integer.valueOf(String.valueOf("1"));
        System.out.println(d);
    }

    private static void display(Component component) {
        for (Component c : component.getChildrenList()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                c.doSomething();
                display(c);
            }
        }
    }
}
