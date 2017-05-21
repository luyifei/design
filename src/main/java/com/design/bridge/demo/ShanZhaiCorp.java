package com.design.bridge.demo;

public class ShanZhaiCorp extends Corp {
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("��ɽկ��Ʒ׬Ǯ...");
    }
}
