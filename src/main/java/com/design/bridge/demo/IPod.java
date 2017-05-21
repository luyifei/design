package com.design.bridge.demo;

public class IPod extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产ipod...");
    }

    @Override
    public void beSelled() {
        System.out.println("销售山寨的...");
    }

}
