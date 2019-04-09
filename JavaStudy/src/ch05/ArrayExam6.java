package ch05;

public class ArrayExam6 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
				{ 1, 2},
				{ 4, 5, 6 },
				{ 7, 8, 9, 19},
				{10, 11, 12}
			};

		int[] last = arr[arr.length - 1];

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == 0) {
				arr[i] = last;
			} else {
				arr[i] = arr[i - 1];
			}
		}
		for (int[] tempArr : arr) {
			for (int temp : tempArr) {
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
}