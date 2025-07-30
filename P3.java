package practice;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("enter teh operator");
		int operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+' : System.out.println("sum of numbers is"+(num1+num2));
		break;
		case '-' : System.out.println("difference of numbers is"+(num1-num2));
		break;
		case '*' : System.out.println("product of numbers is"+(num1*num2));
		break;
		case '/' : System.out.println("quotient of numbers is"+(num1/num2));
		break;
		case '%' : System.out.println("remainder of numbers is"+(num1%num2));
		break;
		default : System.out.println("invalid");
		break;
		
		
		
		
		}
		

	}

}
