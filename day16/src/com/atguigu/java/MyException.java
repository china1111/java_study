package com.atguigu.java;

/*
 * 	自定义异常类
 * 	
 * 	1. 自定义一个类并集成Exception(编译时异常)或者RuntimeException(运行时异常)
 * 	2. 提供两个构造器，一个有参，一个孔参(调用父类的有参构造器)
 * 	3. 提供一个serialVersionUID，也可以不写，系统会默认添加一个，但是建议显示提供一个
 */

public class MyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7736287090372348682L;

	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
}
