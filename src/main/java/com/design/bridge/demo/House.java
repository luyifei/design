package com.design.bridge.demo;

/**
 * ����ʵ�ֻ���ɫ
 * @author User
 *
 */
public class House extends Product {

    @Override
    public void beProducted() {
        System.out.println("������..");
    }

    @Override
    public void beSelled() {
        System.out.println("������...");
    }

}
