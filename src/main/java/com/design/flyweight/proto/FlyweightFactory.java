package com.design.flyweight.proto;

import java.util.HashMap;

public class FlyweightFactory {
    // ����һ��������
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String Extrinsic) {
        // ��Ҫ���صĶ���
        Flyweight flyweight = null;
        // �ڳ���û�иĶ���
        if (pool.containsKey(Extrinsic)) {
            //��ȡ��Ԫ
            flyweight = pool.get(Extrinsic);
            System.out.println("��ȡ��Ԫ...");
        } else {
            // �����ⲿ״̬������Ԫ����
            flyweight = new ConcreteFlyWeight1(Extrinsic);
            // ���õ�����
            pool.put(Extrinsic, flyweight);
            System.out.println("������Ԫ...");
        }
        return flyweight;
    }

}
