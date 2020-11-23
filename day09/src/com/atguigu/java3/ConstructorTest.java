package com.atguigu.java3;

/*
 * 	构造器(Constructor) -- 构造方法
 * 
 * 	作用: 1. 创建对象	2. 对对象进行初始化
 * 
 * 	格式: 
 * 		权限修饰符 类名 (形参列表) {
 * 			执行语句
 * 		}
 * 
 * 	说明:
 * 		1. 如果在类中没有显示的提供构造器，那么系统会默认提供一个空参的构造器。
 * 			那么创建对象是调用的就是这个默认的空参构造器
 * 		2. 如果在勒种显示的提供了构造器，那么系统将不再提供默认的空参构造器
 * 		3. 构造器可以进行重载
 * 	
 * 	总结: 创建对象必调构造器
 * 	
 * 	构造器的特点: 同一个对象只能调用一次
 * 
 * 	构造器的使用场景: 1. 创建对象	2. 给对象进行初始化	3. 在对象中只执行一次的代码放在构造器中
 */

class Animal {
	String name;
	int age;
	
	// 构造器
	public Animal() {
		super();
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("name = " + name + " age = " + age);
	}
}

class Dog {

	private String name;
	private int age;
	private char sex;
	private int legs;
	private int[] numbers;
	
	public Dog() {
		//向numbers中存放数据或者取数据应该都是同一个数组
		numbers = new int[5];
	}
	
	public void createNumbers() {
		numbers = new int[5];
	}
	
	public Dog(String name, int age, char sex, int legs) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.legs = legs;
	}
	
	public void info() {
		System.out.println("name = " + this.name + " age = " + this.age + " sex = " + this.sex + " legs = " + legs);
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		
//		Animal animal = new Animal("二哈", 10);
		Animal animal2 = new Animal();
//		animal.info();
		animal2.info();
		Dog dog = new Dog("二哈", 2, 'm', 4);
		dog.info();
		
	}
}
