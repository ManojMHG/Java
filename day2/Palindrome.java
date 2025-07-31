package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int original = num;
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		if (original == reversed) {
			System.out.println("It's a palindrome number!");
		} else {
			System.out.println("Not a palindrome number.");
		}
	}

}
