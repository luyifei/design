package com.design.iterator.demo;

/**
 * ������ģʽ
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IProject project = new Project();
        for (int i = 0; i < 10; i++) {
            project.add("��" + i + "����Ŀ", i * 5, i * 1000000);
        }
        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
