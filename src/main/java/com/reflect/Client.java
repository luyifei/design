package com.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Client {
    public static void main1(String[] args) {
        Class<?> d1 = null;
        Class<?> d2 = null;
        Class<?> d3 = null;
        try {
            d1 = Class.forName("com.reflect.Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        d2 = new Demo().getClass();
        d3 = Demo.class;
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println(d3.getName());
    }
    public static void main(String[] args) {
        try {
            Person person = (Person) Class.forName("com.reflect.Person").newInstance();
            person.setAge(19);
            person.setName("战三");
            System.out.println(person.toString());
            Constructor[] cons = Class.forName("com.reflect.Person").getConstructors();
            System.out.println(cons[0].toString());
            System.out.println(cons[1].toString());
            System.out.println(cons[0].newInstance());
            System.out.println(cons[1].newInstance("李四",123));
            Class[] infs = Class.forName("com.reflect.Person").getInterfaces();
            System.out.println(infs[0].getName());
            Class fclz = Class.forName("com.reflect.Person").getSuperclass();
            System.out.println(fclz.getName());
            System.out.println(Modifier.toString(cons[0].getModifiers()));
            Method[] mets = Class.forName("com.reflect.Person").getMethods();
            for (Method method : mets) {
                //System.out.println(method);
            }
            //获取自身的属性
            Field[] fields = Class.forName("com.reflect.Person").getDeclaredFields();
            for (Field field : fields) {
                //System.out.println(field);
            }
            //获取接口或父类的属性
            Field[] ffields = Class.forName("com.reflect.Person").getFields();
            for (Field field : ffields) {
                System.out.println(field);
            }
            //调用方法
           Person person2 =  (Person) Class.forName("com.reflect.Person").newInstance();
           seter(person2, "Name", "zhansan", String.class);
           geter(person2, "Name");
           seter(person2, "Age", 19, Integer.class);
           geter(person2, "Age");
           
           //修改属性
           Person person3 = (Person) Class.forName("com.reflect.Person").newInstance();
           Field nameField = Class.forName("com.reflect.Person").getDeclaredField("name");
           nameField.setAccessible(true);
           nameField.set(person3, "李四");
           System.out.println(person3.getName());
           //修改数组
           int[] arr =  {1,2,3,4,5};
           //获取数组对应的对象
           Class<?> arrClz = arr.getClass().getComponentType();
           System.out.println(arrClz.getName());
           System.out.println(Array.getLength(arr));
           Array.set(arr, 0, 100);
           System.out.println(arr.toString());
           System.out.println(Class.forName("com.reflect.Person").getClassLoader().getClass().getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void seter(Object obj,String attr,Object value,Class<?> type){
        try {
           Method method = obj.getClass().getMethod("set"+attr,type);
           method.invoke(obj, value);
           System.out.println("set成功");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void geter(Object obj,String att){
        try {
            Method method = obj.getClass().getMethod("get"+att);
            System.out.println(method.invoke(obj));
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    }
}
