package com.atguigu.exer;

/**
 * 	定义一个类PassObject，在类中定义一个
 * 	方法printAreas()，该方法的定义如下：
 * 	public void printAreas(Circle c,
 * 	int time)，在printAreas方法中打印输出
 * 	1到time之间的每个整数半径值，以及对应的面积。
 * 	例如，times=5，则输出半径1,2,3,4,5以及
 * 	对应的面积
 * @author NightGaunt
 *
 */

public class PassObject {
	
	public void printAreas(Circle c, int time) {
		
		for (int i = 1; i <= time; i++) {
			c.radius = i;
			System.out.println(i + "\t" + c.findArea());
		}
	}

}
