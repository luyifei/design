package com.design.bridge.demo;

/**
 * 具体实现化角色
 * @author User
 *
 */
public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("做房子..");
    }

    @Override
    public void beSelled() {
        System.out.println("卖房子...");
    }

}
