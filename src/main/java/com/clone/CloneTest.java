package com.clone;

import java.util.ArrayList;

public class CloneTest {
	public static void main(String[] args) {
		ArrayList<Person> list1 = new ArrayList<>();
		Person person = new Person();
		person.setAge(18);
		person.setName("zhansan");
		list1.add(person);
		ArrayList<Person> list2 = new ArrayList<>();
		list2 = (ArrayList<Person>) list1.clone();
		list1.get(0).setName("lisi");
		System.out.println(list1.get(0).name);
		System.out.println(list2.get(0).name);
	}
}
