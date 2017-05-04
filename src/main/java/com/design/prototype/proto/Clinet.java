package com.design.prototype.proto;

public class Clinet {
    public static void main(String[] args) {
        // 对象的拷贝一般都是浅拷贝
        // 其对象内部的数组，引用对象等都不拷贝
        // 1.对上述内容进行独立拷贝,例如arrayList.clone;
        // 2.使用二进制流的方式对对象进行深拷贝
        Thing thing = new Thing();
        try {
            Thing t2 = thing.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
