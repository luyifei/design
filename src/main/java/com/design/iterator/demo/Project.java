package com.design.iterator.demo;

import java.util.ArrayList;

public class Project implements IProject {
    private ArrayList<IProject> projectList = new ArrayList<>();
    String name;
    Integer num;
    Integer cost;

    public Project() {

    }

    private Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "" + this.name;
        info = info + "" + this.num;
        info = info + "" + this.cost;
        return info;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public IProjectIterator iterator() {
        System.out.println("´´½¨µü´úÆ÷");
        return new ProjectIterator(projectList);
    }

}
