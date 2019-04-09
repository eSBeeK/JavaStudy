package ch04;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int player = scan.nextInt();
		int com = (int)(Math.random() * 3);

		if (player == com) {
			System.out.println("÷ס±ט");
		} else {
			if ((player + 1) % 3 == com) {
				System.out.println("Áü");
			} else {
				System.out.println("ÀÌ±ט");
			}
		}
	}
}
