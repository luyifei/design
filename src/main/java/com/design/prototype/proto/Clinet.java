package com.design.prototype.proto;

public class Clinet {
    public static void main(String[] args) {
        // ����Ŀ���һ�㶼��ǳ����
        // ������ڲ������飬���ö���ȶ�������
        // 1.���������ݽ��ж�������,����arrayList.clone;
        // 2.ʹ�ö��������ķ�ʽ�Զ���������
        Thing thing = new Thing();
        try {
            Thing t2 = thing.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
