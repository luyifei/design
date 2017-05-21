package com.design.bridge.demo;

/**
 * 抽象化角色
 * @author User
 *
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }
    
    public void makeMoney(){
        this.product.beProducted();
        this.product.beSelled();
        System.out.println("赚钱了...");
    }
}
