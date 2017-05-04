package com.design.prototype.proto;

import java.util.ArrayList;

public class Thing implements Cloneable {
    ArrayList<String> arrayList = new ArrayList<>();
    public Thing() {
        System.out.println("调用构造函数...");
    }
    @Override
    protected Thing clone() throws CloneNotSupportedException {
        Thing thing = null;
        thing = (Thing) super.clone();
        //对引用对象进行独立拷贝，深拷贝
        this.arrayList = (ArrayList<String>) this.arrayList.clone();
        return thing;
    }
}
