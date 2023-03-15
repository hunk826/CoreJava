package Array;

import java.util.Scanner;
public class MarksEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[5];
		 int totalMarks = 0;
	        double percentage;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter 5 subject marks :");
			marks[i]=sc.nextInt();	
			totalMarks += marks[i];
		}
		 percentage = ((double)totalMarks / 650) * 100;
		 
		 
		 System.out.println("Total marks: " + totalMarks);
	        System.out.printf("Percentage: %.2f%%", percentage);

	}

}
