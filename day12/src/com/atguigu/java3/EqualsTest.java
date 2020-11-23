package com.atguigu.java3;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Person person = new Person("aa", 18);
		boolean equals = person.equals("abc");
		System.out.println(equals);
		
		System.out.println("------------------------");
		System.out.println(3 == 5);
		System.out.println(3.0 == 3);
		System.out.println('A' == 65);
		System.out.println("------------------------");
		
		Person p = person;
		System.out.println(p == person);
		p = new Person("cc", 20);
		System.out.println(p == person);
		System.out.println("------------------------");
		
		String string1 = new String("abc");
		String string2 = new String("abc");
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println("------------------------");
		
		Person person2 = new Person("cc", 20);
		Person person3 = new Person("cc", 20);
		System.out.println(person2.equals(person3));
	}

}
