package com.atguigu.exer3;

public class Person {
	
	private int age;
	
	public void setAge(int age) {
		if ((age < 0) || (age > 120)) {
			System.out.println("The age is Wrong");
			throw new NullPointerException("ByeBye");
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}

}
