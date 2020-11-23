package com.atguigu.java;

public class Man extends Person{
	
	@Override
	public void say() {
		System.out.println("Man say");
	}
	
	@Override
	public void show() {
		System.out.println("Man show");
	}
	
	public void buy() {
		System.out.println("Man buy");
	}

}
