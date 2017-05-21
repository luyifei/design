package com.design.flyweight.proto;

public abstract class Flyweight {
    private String intrinsic;
    // 外部状态
    protected final String Extrinsic;

    // 要求享元角色必须接受外部状态
    public Flyweight(String Extrinsic) {
        this.Extrinsic = Extrinsic;
    }

    // 定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
