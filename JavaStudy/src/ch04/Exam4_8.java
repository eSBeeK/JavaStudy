package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if(i % 10 == 3 || i / 10 == 3 || i / 100 == 3) {
				System.out.println(i + " : 3Æ÷ÇÔ");
			}
		}
	}
}
