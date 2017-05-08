package com.design.iterator.demo;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectList = new ArrayList<>();
    private Integer currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        if (this.currentItem >= this.projectList.size() || this.projectList.get(currentItem) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return this.projectList.get(this.currentItem++);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

}
