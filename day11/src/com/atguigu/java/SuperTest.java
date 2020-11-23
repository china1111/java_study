package com.atguigu.java;

/*
 * 	关键字：super
 * 
 * 	super可以调用父类中的属性，方法，构造器
 * 
 * 	super调用父类中的属性和方法
 */

class SuperClass {
	String name = "superClass";
}

class SubClass extends SuperClass {
	{
	name = "subClass";
	}
}

public class SuperTest {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		System.out.println(subClass.name);
	}
}
