package com.design.adapter.clz.demo;

/**
 * ¿‡  ≈‰∆˜
 * @author User
 *
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new OuterUserInfo();
        userInfo.getOfficeTelNumber();
    }
}
