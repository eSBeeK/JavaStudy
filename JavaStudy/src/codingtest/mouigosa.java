package codingtest;

import java.util.ArrayList;
import java.util.List;

public class mouigosa {
	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2};
		solution(answers);
	}
	
	public static int[] solution(int[] answers) {
		int[] score = { 0, 0, 0 };
		int check = 0;
		int index = 0;

		int[][] supojaAnswer = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		// check supoja's score
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < answers.length; j++) {
				if (answers[j] == supojaAnswer[i][j]) {
					score[i] += 1;
				}
			}
		}
		
		int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
		
		List list = new ArrayList<>();
		for (int i = 0; i < score.length; i++)
			if(maxScore == score[i]) list.add(i+1);
		
		int[] answer = new int[list.size()];
		int count = 0;
		
		for (int i = 0; i < list.size(); i++)
			answer[count++] = i+1;	
		// print answer
		for (int i : answer)
			System.out.println(i);

		return answer;
	}
}
