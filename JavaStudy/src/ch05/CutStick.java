package ch05;

public class CutStick {
	public static void main(String[] args) {
		// ���� �ִ� ����
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		
		// �ڸ� �� ���� �� ���� ��� �ݺ�
		while (true) {
			int count = 0;
			int min = 0;
			
			// 0 ���� ū �迭 ����� ������ ����ϸ鼭 0���� ū �ּڰ� �ʱ�ȭ
			for (int i : stick) {
				if (i > 0) {
					count++;
					min = i;
				}
			}
			
			// �� �̻� �ڸ� ���밡 ������ ���α׷� ����
			if (count == 0)
				break;

			// ���� ���� ���� ���
			System.out.println(count);
			
			// ���� ���� �� �ּҰ� ã��
			for (int i : stick) {
				if (min > i && i > 0)
					min = i;
			}
			
			// ���� �ڸ���
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
