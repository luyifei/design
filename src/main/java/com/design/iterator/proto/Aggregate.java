package com.design.iterator.proto;

/**
 * ��������
 * 
 * @author User
 *
 */
public interface Aggregate {
    /**
     * ��ȡ������
     * 
     * @return
     */
    public Iterator<?> iterator();

    public void add(Object object);

    public void remove(Object object);

}
