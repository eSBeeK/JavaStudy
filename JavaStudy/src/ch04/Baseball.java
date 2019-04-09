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

			int strike = 0; // ��Ʈ����ũ�� ������ ������ ����
			int ball = 0; // ���� ������ ������ ����
			int out = 0;

			/*
			 * �ڵ� �ۼ� ��Ʈ����ũ�� �� �˻� ���ǹ� �ۼ�
			 */
			for (int i = 0; i < 3; i++) {
				if (answer[i] == inputNumber[i])
					strike++;
				else if (answer[i] == inputNumber[(i + 1) % 3] || answer[i] == inputNumber[(i + 2) % 3])
					ball++;
				else
					out++;
			}

			System.out.println("��Ʈ����ũ => " + strike);
			System.out.println("�� => " + ball);
			System.out.println("�ƿ� => " + out);

			if (strike == 3) {
				System.out.println("�¸�!");
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
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		return number;
	}
}