package com.design.prototype.proto;

import java.util.ArrayList;

public class Thing implements Cloneable {
    ArrayList<String> arrayList = new ArrayList<>();
    public Thing() {
        System.out.println("���ù��캯��...");
    }
    @Override
    protected Thing clone() throws CloneNotSupportedException {
        Thing thing = null;
        thing = (Thing) super.clone();
        //�����ö�����ж������������
        this.arrayList = (ArrayList<String>) this.arrayList.clone();
        return thing;
    }
}
