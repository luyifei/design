package com.design.composite.transparent;

import java.util.ArrayList;

/**
 * ��Ҷ����
 * 
 * @author User
 *
 */
public class Leaf extends Component {

    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();

    }

    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();

    }

    @Deprecated
    public ArrayList<Component> getChildrenList() {
        throw new UnsupportedOperationException();
    }

}
