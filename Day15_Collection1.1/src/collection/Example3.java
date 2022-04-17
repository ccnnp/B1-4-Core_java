package collection;

import java.util.LinkedList;
public class Example3 {

	public static void main(String[] args) 
	{
		LinkedList<Object> obj=new LinkedList<>();
		obj.add(10);
		obj.add(20);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(5);
		System.out.println(obj);
		System.out.println(obj.size());
		
		LinkedList<Object> obj1=new LinkedList<>();
		obj1.add("Chandu");
		obj1.add("Chandana");
		obj.addAll(2,obj1);
		System.out.println(obj);
		
	}

}
