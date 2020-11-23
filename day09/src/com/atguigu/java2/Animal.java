package com.atguigu.java2;

/**
 * 	面向对象特性: 封装性
 * 
 * 	为什么要是用封装性
 * 		当我们创建对象以后，就可以通过对象名.属性名对属性进行赋值。这种方式默认只能对内容的类型和范围进行约束
 * 		但是在实际开发中往往我们还会有更多的限制条件，但这些限制条件无法在属性的声明处加以限制。所以我们采取
 * 		如下方式: 
 * 		1. 使用private修饰属性，这样就不能直接再使用对象名.属性名进行赋值
 * 		2. 提供公共的方法给属性复制和获取属性的值，这样可以在方法中对赋值的内容加以限制
 * 
 * 	封装性的体现(狭义上)
 * 		1. 私有化属性，提供公共的get/set方法
 * 
 * 	封装性的体现(广义上)
 * 		1. 四种权限修饰符: private 缺省的 protected public
 * 		2. 可以使用四种权限修饰符修饰: 属性， 方法，构造器， 内部类
 * 		3. 类只能用public和缺省的修饰符修饰
 * 
 * 	注意: set/get方法就是普通方法。
 * @author NightGaunt
 *
 */
public class Animal {

	String name;
	private int age;
	private int legs;

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("年龄不合法");
			this.age = 10;
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		if (legs != 4) {
			System.out.println("SB");
			// 赋值一个默认值
//			this.legs = 4;
			/*
			 * 	如果输入的值不在合理范围内
			 * 	1. 给设置一个默认值
			 * 	2. 抛异常强制终止程序
			 */
			throw new NullPointerException("ByeBye");
		} else {
			this.legs = legs;
		}
	}
	
	public void info() {
		System.out.println("name = " + name + " age = " + age + " legs = " + legs);
	}
}
