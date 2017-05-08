package com.design.iterator.proto;

public class Client {
    public static void main(String[] args) {
        Aggregate gate = new ConcreteAggregate();
        for (int i = 0; i < 10; i++) {
            gate.add(i);
        }
        Iterator<?> iterator = gate.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj.hashCode());
        }
    }
}
