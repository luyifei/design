package com.design.visitor.proto;

import java.util.Random;

/**
 * 结构对象，如List，Set，Map
 * 
 * @author User
 *
 */
public class ObjectStruture {
    public static Element getElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
