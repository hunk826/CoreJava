package Operators;

import java.util.Scanner;

public class ComparisonEx {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();

      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();

      
      if (num1 == num2) {
         System.out.println(num1 + " is equal to " + num2);
      } 
      else {
         System.out.println(num1 + " is not equal to " + num2);
      }

      if (num1 > num2) {
         System.out.println(num1 + " is greater than " + num2);
      } else {
         System.out.println(num1 + " is not greater than " + num2);
      }

      if (num1 < num2) {
         System.out.println(num1 + " is less than " + num2);
      } else {
         System.out.println(num1 + " is not less than " + num2);
      }

      if (num1 >= num2) {
         System.out.println(num1 + " is greater than or equal to " + num2);
      } else {
         System.out.println(num1 + " is not greater than or equal to " + num2);
      }

      if (num1 <= num2) {
         System.out.println(num1 + " is less than or equal to " + num2);
      } else {
         System.out.println(num1 + " is not less than or equal to " + num2);
      }

      if (num1 != num2) {
         System.out.println(num1 + " is not equal to " + num2);
      } else {
         System.out.println(num1 + " is equal to " + num2);
      }
   }
}

