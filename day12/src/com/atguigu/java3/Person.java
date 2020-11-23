package com.atguigu.java3;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("name = " + name + ", age = " + age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p.age == this.age && this.name.contentEquals(p.name);
		}
		return false;
	}

}
