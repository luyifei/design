package com.design.bridge.proto;

/**
 * �������󻯽�ɫ
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
        System.out.println("�Լ���ҵ�����...");
    }

}
