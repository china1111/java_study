package com.atguigu.exer;

/*
 * 	EcDef异常
 */

public class EcDef extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4775496390147696379L;

	public EcDef() {
		super();
	}
	
	public EcDef(String message) {
		super(message);
	}

}
