package practice;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt(); 
        if(number<0)
        {
            System.out.println("Invalid");
        }
        else
        {
            for (int i = 1; i <=number; i++) {
                fact=fact*i;
            }
            System.out.println("The Factrial of given number is : "+fact);
        }

	}

}
