package ch04;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Number n = new Number();
		int number = n.get();
		System.out.println(number);
		int[] answer = new int[3];
		answer[2] = number % 10;
		answer[1] = (number / 10) % 10;
		answer[0] = (number / 10 / 10) % 10;

		while (true) {
			Scanner s = new Scanner(System.in);
			int scanNumber = s.nextInt();
			int[] inputNumber = new int[3];
			inputNumber[0] = (scanNumber / 10 / 10) % 10;
			inputNumber[1] = (scanNumber / 10) % 10;
			inputNumber[2] = scanNumber % 10;

			int strike = 0; // 스트라이크를 개수를 저장할 변수
			int ball = 0; // 볼의 개수를 저장할 변수
			int out = 0;

			/*
			 * 코드 작성 스트라이크와 볼 검사 조건문 작성
			 */
			for (int i = 0; i < 3; i++) {
				if (answer[i] == inputNumber[i])
					strike++;
				else if (answer[i] == inputNumber[(i + 1) % 3] || answer[i] == inputNumber[(i + 2) % 3])
					ball++;
				else
					out++;
			}

			System.out.println("스트라이크 => " + strike);
			System.out.println("볼 => " + ball);
			System.out.println("아웃 => " + out);

			if (strike == 3) {
				System.out.println("승리!");
				break;
			}
		}
	}
}

class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/kopo/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return number;
	}
}