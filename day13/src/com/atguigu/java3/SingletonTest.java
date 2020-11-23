package com.atguigu.java3;

/*
 * 	单例设计模式
 * 
 * 	设计模式：设计模式是在大量的实践中总结和理论化之后优选的
 * 			代码结构、编程风格、以及解决问题的思考方式
 * 
 * 	常见的23中设计模式：单例设计模式、工厂设计模式、代理设计模式、观察者设计模式、装饰设计模式
 * 
 * 	单例设计模式：在整个项目中某一个类的对象只能创建一个
 * 
 * 	实现方式：懒汉式、饿汉式
 * 
 * 	懒汉式和饿汉式的区别：
 * 		懒汉式：1. 线程不安全	2. 延迟了对象的创建时机，一定程度上节省了内存的开销
 * 		饿汉式：1. 线程安全		2. 
 */

/**
 * 	饿汉式
 * 		1. 私有化构造器
 * 		2. 创建爱你一个该类的对象，并用static修饰
 * 		3. 提供一个公共方法，用来返回对象。该方法必须是静态方法
 * @author NightGaunt
 *
 */
class Bank {
	private Bank() {
		super();
	}
	
	private static Bank bank = new Bank();
	
	public static Bank getInstance() {
		return bank;
	}
	
}
/**
 * 	懒汉式
 * 		1. 私有化构造器
 * 		2. 提供一个该类的对象声明
 * 		3. 提供一个公共的方法，并返回对象
 * 		4. 创建要返回的对象
 * @author NightGaunt
 *
 */
class Computer {
	private Computer() {
		super();
	}
	private static Computer computer = null;
	public static Computer getInstance() {
		if (computer == null) {
			computer = new Computer();
		}
		return computer;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(Bank.getInstance());
		System.out.println(Bank.getInstance());
		System.out.println(Bank.getInstance());
	}
}
