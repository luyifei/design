package com.design.flyweight.proto;

public abstract class Flyweight {
    private String intrinsic;
    // �ⲿ״̬
    protected final String Extrinsic;

    // Ҫ����Ԫ��ɫ��������ⲿ״̬
    public Flyweight(String Extrinsic) {
        this.Extrinsic = Extrinsic;
    }

    // ����ҵ�����
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

}
