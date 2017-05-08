package com.design.iterator.proto;

import java.util.ArrayList;

public class ConcreteAggregate implements Aggregate {
    private ArrayList<Object> aggregates = new ArrayList<>();

    public ConcreteAggregate() {
    }

    public void add(Object object) {
        this.aggregates.add(object);
    }

    public void remove(Object object) {

    }

    @Override
    public Iterator<Object> iterator() {
        System.out.println("»ñÈ¡µü´úÆ÷");
        return new ConcreteIterator<>(this.aggregates);
    }

}
