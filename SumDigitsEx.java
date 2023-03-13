package CoreJava;

import java.util.Scanner;
public class SumDigitsEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum =0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);

	}

}
