package com.design.decorator.proto;

/**
 * в╟йндёй╫
 * 
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        Component com = new ConcreteComponent();
        com = new ConcreteDecorator1(com);
        com = new ConcreteDecorator2(com);
        com.operate();
    }
}
