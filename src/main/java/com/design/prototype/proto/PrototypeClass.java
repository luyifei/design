package com.design.prototype.proto;

public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass proto  = null;
        proto = (PrototypeClass) super.clone();
        return proto;
    }
}
