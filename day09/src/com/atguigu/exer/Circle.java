package com.atguigu.exer;

/**
 * 	定义一个Circle类，包含衣蛾double型
 * 	的radius属性代表圆的半径，一个findArea()
 * 	方法返回圆的面积
 * 
 * @author NightGaunt
 *
 */

public class Circle {
	
	public double radius;

	public double findArea(){
		return Math.PI * radius * radius;
	}
}
