package com.atguigu.java2;

/*
 * 	变量按照位置分：属性(成员变量) vs 局部变量
 * 				属性(成员变量)：实例变量 vs类变量(static修饰的属性)
 * 
 * 	static可以修饰：属性，方法，代码块，内部类
 * 
 * 	static修饰属性(类变量)
 * 		1. 同一个类创建的多个对象，每个对象单独拥有一份实例变量，共同拥有一份类变量
 * 		2. 当某个对象对类变量进行修改后，其他对象看到的是修改后的值
 * 		3. 类变量是随着类的加载而加载的(类加载只能加载一次)。实例变量是随着对象的创建儿创建的
 * 		4. 调用类变量的方法：类名.变量名	对象.变量名
 * 
 * 	static修饰方法(静态方法)
 * 		1. 静态方法是随着类的加载而加载的
 * 		2. 静态方法中不能调用实例变量和非静态方法
 * 		3. 非静态方法中可以调用类变量和静态方法
 * 		4. 静态方法中不能使用this和super关键字
 * 
 * 	static使用场景：
 * 		static修饰属性：
 * 			1. 多个对象需共同拥有该属性时使用static修饰
 * 			2. 常量：public static final double PI = ...
 * 		static修饰方法：
 * 			1. 工具类中的方法都是静态方法
 * 			2. 有时为了调用类变量方法也会定义成静态方法
 * 
 */

class Person {
	String name;
	int age;
	static String country = "中国";
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * 	静态方法中不能调用实例变量和非静态方法
	 */
	public static void show() {
		System.out.println("static show");
	}
	
	public void show2() {
		System.out.println("not static show");
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", age = " + age + ", country = " + country;
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Person p1 = new Person("强东", 46);
		Person p2 = new Person("码云", 48);
		Person p3 = new Person("华腾", 38);
		p1.country = "meiguo";
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
