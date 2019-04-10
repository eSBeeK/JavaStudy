package ch05;

public class CutStick {
	public static void main(String[] args) {
		// 갖고 있는 막대
		int[] stick = { 5, 4, 4, 2, 2, 8 };
		
		// 자를 게 없을 때 까지 계속 반복
		while (true) {
			int count = 0;
			int min = 0;
			
			// 0 보다 큰 배열 요소의 개수를 출력하면서 0보다 큰 최솟값 초기화
			for (int i : stick) {
				if (i > 0) {
					count++;
					min = i;
				}
			}
			
			// 더 이상 자를 막대가 없으면 프로그램 종료
			if (count == 0)
				break;

			// 남은 막대 갯수 출력
			System.out.println(count);
			
			// 남은 막대 중 최소값 찾기
			for (int i : stick) {
				if (min > i && i > 0)
					min = i;
			}
			
			// 막대 자르기
			for (int i = 0; i < stick.length; i++) {
				stick[i] -= min;
			}
		}
	}
}
