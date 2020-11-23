package com.atguigu.exer2;

public class ArrayUtils {
	
	public void sort(int[] numbers) {
		for (int i = numbers.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] < numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	/**
	 * 	线性查找
	 * @param numbers
	 * @param findNumber
	 * @return
	 */
	public int findNumber(int[] numbers, int findNumber) {
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == findNumber) {
				index = i;
				break;
			}
		}
		return index;
	}
	/**
	 * 	数组反转
	 * @param numbers
	 */
	public void reverse(int[] numbers) {
		for (int i = 0, j = numbers.length-1; i <= numbers.length / 2; i++, j--) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}
	public int[] reverse2(int[] numbers) {
		int[] reverseNumbers = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			reverseNumbers[i] = numbers[numbers.length-1-i];
		}
		return reverseNumbers;
	}
	/**
	 * 	求数组的平均数
	 * @param numbers
	 * @return
	 */
	public int avg(int[] numbers) {
		return sum(numbers)/numbers.length;
	}
	/**
	 * 	求数组的和
	 * @param numbers
	 * @return
	 */
	public int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	/**
	 * 	求数组中的最小值
	 * @param numbers
	 * @return
	 */
	public int minNumber(int[] numbers) {
		int minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
//			if (minNumber > numbers[i]) {
//				minNumber = numbers[i];
//			}
			minNumber = minNumber > numbers[i]? numbers[i]: minNumber;
		}
		return minNumber;
	}
	
	/**
	 * 	求数组中最大值
	 * @param numbers
	 * @return
	 */
	public int maxNumber(int[] numbers) {
		int maxNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
//			if (maxNumber < numbers[i]) {
//				maxNumber = numbers[i];
//			}
			maxNumber = maxNumber > numbers[i]? maxNumber: numbers[i];
		}
		return maxNumber;
	}

}
