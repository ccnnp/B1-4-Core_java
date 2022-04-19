package collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Example7 
{

	public static void main(String[] args) 
	{
		NavigableMap<Integer,String> s=new TreeMap<Integer,String>();  
		s.put(11,"Hi");
		s.put(13,"Chandana");
		s.put(12,"How are you");
		System.out.println(s);
		System.out.println(s.firstEntry());
		System.out.println(s.lastEntry());
	}

}
