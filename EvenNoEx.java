package CoreJava;

import java.util.Scanner;

public class EvenNoEx {

	public static void main(String[] args) {
		
		int e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer :");
		
		
		e=sc.nextInt();
		System.out.println("Even numbers from 2 to " + e + ":");
		int b=2;
		
	while(b<=e)
	{
		
		System.out.println(b);
		b+=2;
	}
		

	}

}
