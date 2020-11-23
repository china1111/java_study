package com.atguigu.java3;

class Score {
	int[] scores;
	
	public Score() {
		scores = new int[5];
	}
	
	public void createScores() {
		scores = new int[5];
	}
}
public class ConstructorTest2 {

	public static void main(String[] args) {
		Score score = new Score();
		score.scores[0] = 10;
//		score.createScores();
		for (int i = 0; i < score.scores.length; i++) {
			System.out.println(score.scores[i]);
		}
	}
}
