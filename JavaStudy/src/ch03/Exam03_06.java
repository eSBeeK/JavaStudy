package ch03;

import java.util.*;

public class Exam03_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99) >> ");
		int n = scanner.nextInt();
		
		int ten = 0;
		int one = 0;
		
		boolean isMatch = false;
		
		ten = n / 10;
		one = n % 10;
		
		if(ten == one)
			isMatch = !isMatch;
		
		System.out.println(isMatch);
		scanner.close();
	}
}
