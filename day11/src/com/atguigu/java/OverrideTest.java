package com.atguigu.java;

/*
 * 
 * 	方法的重写：有了继承以后就可以考虑使用方法的重写。子类可以对父类的方法进行覆盖
 *
 */

class Animal {
	

	
	public  void say() {
		System.out.println("动物说话了");
	}
}

class Dog extends Animal {

	
	@Override	// 注解 - 用来说明注解的方法是一个重写的方法，如果不是则报错
	public void say() {
		System.out.println("汪汪汪...");
	}

}

public class OverrideTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.say();
	}
}
