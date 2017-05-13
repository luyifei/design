package com.design.observe.demo;

import java.util.Observable;

/**
 * 发布者--被观察者
 * @author sunny
 *
 */
public class Publish extends Observable{
    public void doSomething(){
        System.out.println("publish message...");
        super.setChanged();
        super.notifyObservers("message...");
    }
}
