package Operators;

import java.util.Scanner;
public class ArithematicEx 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number :");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		int dif=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int rmd=num1%num2;
		
		
		
		System.out.println("Addition of the numbers :"+sum);
		System.out.println("Subtration of the numbers :"+dif);
		System.out.println("Multiplication of the numbers :"+mul);
		System.out.println("Division of the numbers :"+div);
		System.out.println("Modulus of the numbers :"+rmd);
		sc.close();
	}
	
}
