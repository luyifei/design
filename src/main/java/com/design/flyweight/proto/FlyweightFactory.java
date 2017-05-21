package com.design.flyweight.proto;

import java.util.HashMap;

public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String Extrinsic) {
        // 需要返回的对象
        Flyweight flyweight = null;
        // 在池中没有改对象
        if (pool.containsKey(Extrinsic)) {
            //获取享元
            flyweight = pool.get(Extrinsic);
            System.out.println("获取享元...");
        } else {
            // 根据外部状态创建享元对象
            flyweight = new ConcreteFlyWeight1(Extrinsic);
            // 放置到池中
            pool.put(Extrinsic, flyweight);
            System.out.println("创建享元...");
        }
        return flyweight;
    }

}
