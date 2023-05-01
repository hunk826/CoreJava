package Collections;

import java.util.*;
public class ArrayListEx {

	public static void main(String[] args)
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		
		//Adding object in ArrayList
		arraylist.add("Hello");
		arraylist.add("World");
		arraylist.add(".");
		arraylist.add("World");
		
		//traversing list through iterator
		Iterator itr=arraylist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
