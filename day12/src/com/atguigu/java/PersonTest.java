package com.atguigu.java;

/*
 * 	免息那个对象特性：多态
 * 
 * 	一 多态性：一类事物的多种状态
 * 
 * 	二 何为多态：
 * 		广义上：1. 方法的重写，方法的重载	2. 子类对象的多态性
 * 		狭义上：子类对象的多态性
 * 
 * 	三 子类对象的多态性：父类的引用指向子类的对象。
 */

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Woman();
		Person person2 = new Man();
		person.show();
		person2.show();
		person.say();
		person2.say();
		System.out.println(person.getClass().getName());
		if (person instanceof Woman) {
//			Woman Person = (Woman) Person;
		}
	}
}
