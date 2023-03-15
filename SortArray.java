package Array;

import java.util.Scanner;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		int str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		str=sc.nextInt();
		
		String[] arr= new String[str];
		System.out.println("Enter the array Element:");
		
        for(int i=0;i<str;i++)
        {
        	arr[i]=sc.nextLine();
        	
        }
        Arrays.sort(arr); 
        System.out.println("Sorted array:");
        for(String i:arr)
        {
     	   System.out.print(i+"  ");
        }

	}

}
