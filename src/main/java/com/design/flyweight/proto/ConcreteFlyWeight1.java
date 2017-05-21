package com.design.flyweight.proto;

public class ConcreteFlyWeight1 extends Flyweight {
    /**
     * 接受外部状态
     * 
     * @param Extrinsic
     */
    public ConcreteFlyWeight1(String Extrinsic) {
        super(Extrinsic);
    }

    /**
     * 根据外部状态进行业务操作
     */
    @Override
    public void operate() {

    }

}
