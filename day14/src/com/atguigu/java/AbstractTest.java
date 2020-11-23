package com.atguigu.java;

/*
 * 	关键字abstract：
 * 
 * 	abstract可以修饰：方法和类
 * 
 * 	abstract修饰类(抽象类)
 * 		1. 抽象类不能被实例化
 * 		2. 抽象类有构造器
 * 		3. 非抽象子类继承抽象类后必须重写抽象父类中的所有抽象方法
 * 		4. 如果非抽象子类不想重写抽象父类中的抽象方法，那么该子类也需要变成抽象子类
 * 
 * 	abstract修饰方法(抽象方法)
 * 		1. 抽象方法没有方法体
 * 		2. 抽象方法所在的类必须为抽象类
 * 
 * 
 */

class Math {
	public void info() {
		System.out.println("math");
	}
}

/*
 * 	抽象类：1. 抽象方法所在的类必须为抽象类 2. 抽象类不能被实例化
 */
abstract class GeometricObject extends Math{
	/**
	 * 	抽象方法 -- 没有方法体
	 * @return
	 */
	public abstract double findArea();
}
/**
 * 	抽象子类 -- 非抽象子类
 * 		1. 非抽象子类，继承抽象类后必须重写抽象类中的抽象方法
 * 		2. 如果非抽象子类不想重写抽象父类中的抽象方法，那么该子类也需要变成抽象子类
 * 
 * @author NightGaunt
 *
 */
class Circle extends GeometricObject {
	
	@Override
	public double findArea() {
		return 0.0;
	}
}

public class AbstractTest {

	public static void main(String[] args) {
//		new GeometricObject();
		new Circle().info();
	}

}
