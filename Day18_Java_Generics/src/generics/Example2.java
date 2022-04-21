package generics;

import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> n = new LinkedList<Integer>();
		n.add(5);
		n.add(10);
		System.out.println(n);
		Iterator<Integer> itr = n.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
