package practice;

public class Example {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 0, 1, 0, 6, 0 };
		int n=arr.length;
		int pos = 0;

		for (int i = 0; i <n; i++) {
			if (arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		for (int i = pos; i < n; i++) {
			arr[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
