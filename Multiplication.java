package CoreJava;

import java.util.Scanner;

public class Multiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Multiplication table of " + number + ":");
        
        for (int i = 1; i <= 10; i++) 
        {
        	System.out.println(number + " x " + i + " = " + (number * i));
        }
	}

}
