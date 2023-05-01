package Collections;
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(15);
		pq.add(20);
		pq.add(36);
		pq.add(19);
		
		System.out.println("Total Elements are : "+pq);
		
		//printing the top element
		System.out.println("Top Element is : "+pq.peek());
		
		//Removing top element
		System.out.println("Top element is : "+pq.poll());
		
		System.out.println("Total Elements are : "+pq);

	}

}
