package ch03;

import java.util.Scanner;

public class Operation5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		
		char result = inputNumber >= 0 ? '��' : '��';
		
		System.out.println(result);
	}
}