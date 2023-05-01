package Collections;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) 
	{
		//create a object of queue interface
		Queue<Integer> que=new LinkedList<>();
		
		//add elements
		for(int i =0;i<5;i++)
		{
			que.add(i);
		}
		
		//displaying th elements
		System.out.println("Elements of queue : "+que);
		
		//to remove the head of queue
		int r=que.remove();
		System.out.println("Remove elemet is :"+r);
		System.out.println("Elements of queue : "+que);
		
		//to view the head element of queue
		int h=que.peek();
		System.out.println("Head of queue : "+h);
		
		int s=que.size();
		System.out.println("Size of queue : "+s);

	}

}
