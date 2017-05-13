package com.design.observe.proto;

import java.util.ArrayList;

/**
 * 被观察者
 * 
 * @author sunny
 *
 */
public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            // 通知观察者
            observer.update();
        }
    }
    public void saySomething(){
        System.out.println("saySomething...");
        this.notifyObservers();
    }
}
