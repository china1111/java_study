package com.atguigu.exer2;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		ArrayUtils arrayUtils = new ArrayUtils();
//		arrayUtils.reverse(numbers);
//		System.out.println(Arrays.toString(numbers));
		
//		int index = arrayUtils.findNumber(numbers, 5);
//		System.out.println(index);
		arrayUtils.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
