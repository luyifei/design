package com.design.bridge.proto;

/**
 * 修正抽象化角色
 * 
 * @author User
 *
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        System.out.println("自己的业务操作...");
    }

}
