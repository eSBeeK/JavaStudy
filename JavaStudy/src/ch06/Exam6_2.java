package ch06;

public class Exam6_2 {
	public static void main(String[] args) {
		int n = 100;
		int total = sumAll(n);
		System.out.println("1 ~ " + n + " ������ �� : " + total);

	}
	// �޼ҵ� �ۼ�
	public static int sumAll(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}