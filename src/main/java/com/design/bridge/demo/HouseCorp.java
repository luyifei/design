package com.design.bridge.demo;

/**
 * 修正抽象化角色
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
        System.out.println("卖房子挣大钱...");
    }
}
