package com.atguigu.java;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

/*
 * 	throw(制造异常):手动向外抛异常
 */

public class ThrowTest {

	@Test
	public void test() {
		setAge(-5);
	}
	
	/*
	 * 	抛编译时异常
	 */
	public void setAge2(int age) throws FileNotFoundException {
		if (age < 0) {
			throw new FileNotFoundException("不能小于0");
		}
	}
	
	public void setAge(int age) {
		if (age < 0) {
			age = 10;
//			System.out.println("哥们你别瞎写");
			// 抛异常 - 如果传参不在合理范围内，则终止程序运行
			throw new NullPointerException("不能小于0");
		}
	}
}
