package com.design.bridge.demo;

/**
 * �������󻯽�ɫ
 * @author User
 *
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("����������Ǯ...");
    }
}
