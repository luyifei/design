package com.design.composite.safe;

/**
 * ���ģʽ -- ��ȫģʽ
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
     *            �˴��޷�ʹ��Component����Ϊ����û��getChildrenList()����
     */
    public static void display(Composite composite) {
        for (Component c : composite.getChildrenList()) {
            if (c instanceof Leaf) {
                // Ҷ�ӽڵ�
                c.doSomething();
            } else {
                // �˴�����������ԭ���ͻ������ǿתΪ���ࣩ
                display((Composite) c);
            }
        }
    }
}
