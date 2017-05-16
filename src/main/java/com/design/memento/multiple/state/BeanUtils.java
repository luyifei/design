package com.design.memento.multiple.state;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            // ��ȡBean����
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // ��ȡ��������
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                // ��������
                String fileName = des.getName();
                // ��ȡ���Է���
                Method getter = des.getReadMethod();
                // ��ȡ����ֵ
                Object fieldValue = getter.invoke(bean);
                System.out.println("fieldValue" + fieldValue);
                if (!fileName.equalsIgnoreCase("class")) {
                    result.put(fileName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> param) {

        try {
            // ��ȡBean����
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // ��ȡ��������
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                // ��������
                String fileName = des.getName();
                if (param.containsKey(fileName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, param.get(fileName));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
