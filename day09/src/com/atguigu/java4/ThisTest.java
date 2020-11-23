package com.atguigu.java4;

class Cat {
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("this ===== " + this);
	}
	
	public void info() {
		System.out.println(name + " " + age);
	}
}
public class ThisTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("0");
		System.out.println(cat);
		Cat cat2 = new Cat();
		cat2.setName("1");
		System.out.println(cat2);
	}
}
