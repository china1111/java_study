package com.atguigu.java;

import org.junit.jupiter.api.Test;

/*
 * 	包装类
 */

public class WrapperTest {

	/*
	 * 	基本数据类型 -> 包装类
	 */
	@Test
	public void test2() {
		int i0 = 10;
		Integer integer0 = new Integer(i0);
		System.out.println(integer0);
		System.out.println("------------------");
		boolean b0 = true;
		Boolean boolean0 = new Boolean(b0);
		System.out.println(boolean0);
	}
	
	/*
	 * 	包装类 -> 基本数据类型
	 */
	@Test
	public void test3() {
		Integer integer0 = new Integer(100);
		int i0 = integer0;
		int i1 = integer0.intValue();
		System.out.println(i0);
		System.out.println(i1);
		System.out.println("-----------------");
		Boolean boolean0 = new Boolean(true);
		boolean b0 = boolean0.booleanValue();
		boolean b1 = boolean0;
		System.out.println(b0);
		System.out.println(b1);
	}
	
	/*
	 * 	自动装箱：
	 * 	自动拆箱：
	 */
	@Test
	public void test4() {
		info(20);
		info(10.0);
	}
	public void info(Object obj) {
		System.out.println(obj.getClass().getName());
	}
	
	/*
	 * 	包装类，基本数据类型 -> String
	 */
	@Test
	public void test5() {
		Integer integer = new Integer(30);
		String str = integer.toString();
		System.out.println(str);
		// 基本数据类型 -> String
		int number = 10;
		// 第一种方式
		String s = number + "";
		System.out.println(s);
		// 第二种方式
		String s2 = String.valueOf(number);
		System.out.println(s2);
	}
	
	/*
	 * 	String -> 包装类，基本数据类型
	 */
	
	@Test
	public void test() {
		String n = "50";
		String n2 = "100";
	}
}
