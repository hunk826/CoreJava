package CoreJava;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 - 10 :");
		
		 a =sc.nextInt();
		
		while (a<1 || a>10)
		{
			System.out.println(" Invalid Input Please Enter a number between 1 and 10");
			System.out.println(" Enter a number between 1 - 10 :");
			
			 a=sc.nextInt();
		}
		System.out.println("You entered a number : "+a);

	}

}
