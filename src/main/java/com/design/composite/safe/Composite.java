package com.design.composite.safe;

import java.util.ArrayList;

/**
 * Ê÷Ö¦¹¹¼þ
 * @author User
 *
 */
public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        component.setParent(this);
        componentArrayList.add(component);
    }

    public void remove(Component component) {
        componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildrenList() {
        return this.componentArrayList;
    }
}
