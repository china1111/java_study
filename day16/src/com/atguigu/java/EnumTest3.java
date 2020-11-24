package com.atguigu.java;

/*
 * 	四 实现接口的枚举类
 */

interface MyInterface {
	void description();
}

enum Season4 implements MyInterface {
	SPRING("春天") {
		@Override
		public void description() {
			System.out.println("春天来了");
		}
	}, SUMMER("夏天") {
		@Override
		public void description() {
			System.out.println("夏天来了");
		}
	}, AUTUMN("秋天") {
		@Override
		public void description() {
			System.out.println("秋天来了");
		}
	}, WINTER("冬天") {
		@Override
		public void description() {
			System.out.println("冬天来了");
		}
	};
	
	private String name;
	private Season4(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class EnumTest3 {

	public static void main(String[] args) {
		Season4.SPRING.description();

	}
}
