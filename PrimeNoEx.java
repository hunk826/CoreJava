package CoreJava;

import java.util.Scanner;
public class PrimeNoEx {

	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		
		a=sc.nextInt();
		boolean r=true;
		int i = 2;
		do
		{
			if(a % i == 0)
			{
				r=false;
				
			}
			i++;
		}while(i <=a/2);
		if(r && a>1)
		{
			System.out.println(a+"is prime .");
		}
		else {
			System.out.println(a+" is not prime.");
		}

	}

}
