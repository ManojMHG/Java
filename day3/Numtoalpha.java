package practice;

import java.util.Scanner;

public class Numtoalpha {
    public static String convertToAlphabet(int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            number--;
            int remainder = number % 26;
            char letter = (char) ('a' + remainder);
            result.insert(0, letter);
            number /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        String output = convertToAlphabet(input);
        System.out.println(output);
    }
}

