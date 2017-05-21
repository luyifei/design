package com.design.flyweight.proto;

public class ConcreteFlyweight2 extends Flyweight {

    /**
     * 接受外部状态
     * 
     * @param Extrinsic
     */
    public ConcreteFlyweight2(String Extrinsic) {
        super(Extrinsic);
    }

    /**
     * 根据外部状态进行业务操作
     */
    @Override
    public void operate() {

    }

}
