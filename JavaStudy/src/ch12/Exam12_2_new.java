package ch12;

public class Exam12_2_new {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		String msg = "Cyqw amkc, cyqw em";

		/* �ݺ����� �̿��Ͽ� ���ڿ��κ��� ���� �������� */
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
		/* A ~ Z, a ~ z ������ �����̸� �ƽ�Ű �ڵ带 2 ������Ų �� ��� */
		/* ��, X / x / Z / z �� ��� 2 ���� �� */
		/* ���ĺ� ������ ����� �ʵ��� ó�� */
			if(((int)c>=ASCII_A && (int)c<=ASCII_Z-2) || ((int)c>=ASCII_a && (int)c<=ASCII_z-2)) {
				c += 2;
				System.out.print(c);
			}
			else if((int)c == ASCII_Z-1 || (int)c == ASCII_Z){
				c -= 24;
				System.out.print(c);
			}
			else if ((int)c == ASCII_z-1 || (int)c == ASCII_z) {
				c -= 24;
				System.out.print(c);
			}
			else
				System.out.print(c);
		}
		/* A ~ Z, a ~ z ������ ���ڰ� �ƴϸ� �״�� ��� */
	}
}