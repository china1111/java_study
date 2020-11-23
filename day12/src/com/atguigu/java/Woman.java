package com.atguigu.java;

public class Woman extends Person {

	@Override
	public void say() {
		System.out.println("Woman say");
	}
	
	@Override
	public void show() {
		System.out.println("Woman show");
	}
	
	public void buy() {
		System.out.println("Woman buy");
	}
}
