package Collections;

import java.util.*;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("Fan");
		dq.addFirst("Table fan");
		dq.addLast("Celeing Fan");
		dq.add("Motor fan");
		
		System.out.println("Elements are : "+dq);
		
		//printing the top element
		System.out.println("Remove Element is : "+dq.pop());
		
		//Removing top element
		System.out.println("Element is : "+dq.pollFirst());
		
		System.out.println("Elements are : "+dq.pollLast());


	}

}
