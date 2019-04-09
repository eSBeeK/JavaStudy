package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		int div = 10000;
		int sub = 0;
		while (true) {
			sub = (num / div) * div;
			total += num / div;
			div /= 10;
			num -= sub;
			if (div == 1) {
				total += num;
				break;
			}
		}
		System.out.println(total);
	}
}