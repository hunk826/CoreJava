package Operators;

import java.util.Scanner;

public class AssignmentEx {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      
      System.out.println("Enter another number :");
      int num1=sc.nextInt();
      
      int add=num += num1; 
      System.out.println("Addition of  number is: " + add);

      int sub=num -= num1; 
      System.out.println("Subtraction of number is: " + sub);

      int mul=num *= num1; 
      System.out.println("Multiplication of number is: " + mul);

      int div=num /= num1; 
      System.out.println("Division of  number is: " + div);

      int mod=num %= num1; 
      System.out.println("Reminder of number is: " + mod);
   }
}

