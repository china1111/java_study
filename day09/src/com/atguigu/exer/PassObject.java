package com.atguigu.exer;

/**
 * 	����һ����PassObject�������ж���һ��
 * 	����printAreas()���÷����Ķ������£�
 * 	public void printAreas(Circle c,
 * 	int time)����printAreas�����д�ӡ���
 * 	1��time֮���ÿ�������뾶ֵ���Լ���Ӧ�������
 * 	���磬times=5��������뾶1,2,3,4,5�Լ�
 * 	��Ӧ�����
 * @author NightGaunt
 *
 */

public class PassObject {
	
	public void printAreas(Circle c, int time) {
		
		for (int i = 1; i <= time; i++) {
			c.radius = i;
			System.out.println(i + "\t" + c.findArea());
		}
	}

}
