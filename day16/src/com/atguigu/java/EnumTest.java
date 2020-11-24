package com.atguigu.java;

/*
 * 	二 通过使用enum关键字创建枚举类
 * 		格式：enum 枚举类的类名 {}
 * 
 * 	三 Enum常用方法
 * 		values()
 * 		valueOf()
 */
enum Season3{
	SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");
	
	private final String name;
	private Season3(String name) {
		this.name = name;
	}
}

public class EnumTest {

	public static void main(String[] args) {
		Season3[] values = Season3.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		Season3 winter = Season3.valueOf("WINTER");
		System.out.println(winter);
	}
}
