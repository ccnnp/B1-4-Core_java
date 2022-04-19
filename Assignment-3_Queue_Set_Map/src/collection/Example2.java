package collection;

import java.util.ArrayDeque;

public class Example2 
{

	public static void main(String[] args) 
	{
		ArrayDeque a=new ArrayDeque();
		a.add(10);
		a.add("Chandana");
		a.addFirst(9.5);
		a.addLast(30);
		System.out.println(a);
	}

}
