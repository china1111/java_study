package com.atguigu.java;

/**
 * 	四种权限修饰符：private 缺省的 protected public
 * 
 * 	本类中可以使用: private, 缺省的, protected, public
 * 	本包中(同一个包，不同类): 缺省的, protected, public
 * 	不是同一个包: public, 不同包的子类(protected)
 * 	不是同一个包(也不是子类): public
 * 
 * 	
 * 
 * @author NightGaunt
 *
 */

public class ModiferTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.name);
		System.out.println(person.nameProtected);
		System.out.println(person.namePublic);
		
	}
	
}
