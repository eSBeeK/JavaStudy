package ch05;

public class CutStick {
	public static void main(String[] args) {
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		while (true) {
			int count = 0;
			int min = 0;
			
			for (int i : stick) {
				if (i > 0)
					count++;
				min = i;
			}
			
			System.out.println(count);

			for (int i : stick) {
				if (min > i && i > 0)
					min = i;
			}

			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
