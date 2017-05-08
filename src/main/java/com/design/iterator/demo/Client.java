package com.design.iterator.demo;

/**
 * 迭代器模式
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IProject project = new Project();
        for (int i = 0; i < 10; i++) {
            project.add("第" + i + "个项目", i * 5, i * 1000000);
        }
        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
