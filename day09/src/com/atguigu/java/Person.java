package com.atguigu.java;

public class Person {

	private String namePrivate = "namePrivate";
	String name = "name";
	protected String nameProtected = "nameProtected";
	public String namePublic ="namePublic";
	
	private void sayPrivate() {
		System.out.println("sayPrivate");
	}
	
	void say() {
		System.out.println("say");
	}
	
	protected void sayProtected() {
		System.out.println("sayProtected");
	}
	
	public void sayPublic() {
		System.out.println("sayPublic");
	}
	
	public void test() {
		System.out.println(namePrivate);
		System.out.println(name);
		System.out.println(nameProtected);
		System.out.println(namePublic);
		
		sayPrivate();
		say();
		sayProtected();
		sayPublic();
	}
	
}
