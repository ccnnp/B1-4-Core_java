package collection;

import java.util.ArrayList;

public class Example2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>(1);
		obj.add(10);
		obj.add(20);
		obj.add(20);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(20));
		System.out.println(obj.indexOf(20));
		System.out.println(obj.indexOf(20));
		System.out.println(obj.lastIndexOf(20));
		System.out.println(obj.get(1));
		obj.set(1,101);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	}

}
