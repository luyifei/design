package com.design.composite.transparent;

import java.util.ArrayList;

/**
 * Ê÷Ö¦¹¹¼þ
 * @author User
 *
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    @Override
    public void add(Component component) {
        component.setParent(this);
        componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    @Override
    public ArrayList<Component> getChildrenList() {
        return this.componentArrayList;
    }

}
