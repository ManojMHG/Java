package practice;

public class Movezerotolast {

	public static void main(String[] args) { 
		int[] arr = { 2,0, 3, 4, 0, 1, 0,1,0,4, 6, 0 };
		int n=arr.length;
		int pos = 0;
		System.out.println("initial array is array is :"+" ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i <n; i++) {
			if (arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		for (int i = pos; i < n; i++) {
			arr[i] = 0;
		}
		System.out.println("\nfinal array is :"+" ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
