package ch05;

public class ArrayExam3 {
	public static void main(String[] args) {
		int[] numbers = { 0, 1, 3, 7, 4 };

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("ÃÖ¼Ò°ª : " + min);
	}
}