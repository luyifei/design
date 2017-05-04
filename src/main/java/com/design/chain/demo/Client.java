package com.design.chain.demo;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setHandler(husband);
        husband.setHandler(son);
        for (IWomen iWomen : arrayList) {
            father.handlerMessage(iWomen);
        }
    }
}
