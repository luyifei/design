package com.design.iterator.proto;

/**
 * 抽象容器
 * 
 * @author User
 *
 */
public interface Aggregate {
    /**
     * 获取迭代器
     * 
     * @return
     */
    public Iterator<?> iterator();

    public void add(Object object);

    public void remove(Object object);

}
