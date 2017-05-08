package com.design.iterator.proto;

import java.util.ArrayList;

public class ConcreteIterator<E> implements Iterator<E> {

    private ArrayList<Object> aggregates = new ArrayList<>();
    private Integer currCount = 0;

    public ConcreteIterator(ArrayList<Object> aggregates) {
        System.out.println(aggregates.size());
        this.aggregates = aggregates;
    }

    @Override
    public boolean hasNext() {
        if (currCount >= aggregates.size() || aggregates.get(currCount) == null) {
            return false;
        }
        return true;
    }

    @Override
    public E next() {
        return (E) this.aggregates.get(currCount++);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

}
