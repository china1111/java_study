package com.atguigu.java2;

import com.atguigu.java.Person;

public class ModiferTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.sayPublic();
		System.out.println(person.namePublic);
	}
}
