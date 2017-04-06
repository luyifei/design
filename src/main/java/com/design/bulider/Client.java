package com.design.bulider;

import java.util.ArrayList;

/**
 * 建造者模式
 * @author sunny
 *
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		CarModel a = director.getABCCarModel();
		CarModel b = director.getBBCCarModel();
		CarModel c = director.getCBMWCarModel();
		CarModel d = director.getDBMWCarModel();
//		b.run();
//		c.run();
//		d.run();
		ArrayList<StringBuffer> list1 = new ArrayList<>();
		list1.add(new StringBuffer("123"));
		list1.add(new StringBuffer("234"));
		ArrayList<StringBuffer> list2 = (ArrayList<StringBuffer>) list1.clone();
		list1.add(new StringBuffer("456"));
		list2.add(new StringBuffer("111"));
		System.out.println(list1.toString());
		System.out.println(list2.toString());
	}
}
