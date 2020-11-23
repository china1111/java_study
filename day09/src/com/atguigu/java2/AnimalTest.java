package com.atguigu.java2;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		// 给属性赋值
		animal.name = "二哈";
		animal.setAge(2);
		animal.setLegs(4);
		animal.info();
		System.out.println("程序结束");
	}

}
