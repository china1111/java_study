package com.atguigu.java3;

/*
 * 	注解(Annotation):
 * 
 * 	作用：注解可以对类中的结构(属性，方法，构造器等)进行补充说明，同时不改变原有的结构
 * 
 * 	熟悉系统常用的三个注解：
 * 		@Override:限定重写父类方法，该注解只能用于方法
 * 		@Deprecated:用于表示所修饰的元素(类，方法等)已过时。通常是因为所修饰的结构危险或存在更好的选择
 * 		@SuppressWarnings:抑制编译器警告
 * 
 * 	自定义注解：
 * 		格式：@interface 注解名{
 * 				String name() default "aaa";
 * 			}
 * 
 * 	元注解：注解的注解(作用在注解上面的注解)
 * 		@Retention: 用来说明目标注解的生命周期
 * 			RetentionPolicy.SOURCE: 被编译器抛弃，不再使用
 * 			RetentionPolicy.CLASS: 编译期间可用 -- 运行期间(运行期间该注解不可用)
 * 			RetentionPolicy.RUNTIME: 运行期间 -- (在整个运行期间都存活)
 * 		@Target: 用来说明目标注解可以使用的结构
 * 		-----下面的知道即可-----
 * 		@Documented: 说明目标注解是否可以被javadoc解析
 * 		@Inherited: 说明目标注解是否可以被子类继承
 * 
 * 	通过反射获取注解上面的信息(反射的时候再说)
 * 	
 */

@interface MyAnn {
	
}

@interface MyAnn2 {
	String name() default "aaa";
}

@MyAnn2(name="helloWorld")
@MyAnn
public class AnnotationTest {

	@MyAnn
	@MyAnn2
	@Deprecated
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
