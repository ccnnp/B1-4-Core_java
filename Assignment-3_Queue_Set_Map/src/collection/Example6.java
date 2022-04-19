package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example6 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> s=new HashMap<Integer,String>();  //unordered
		s.put(10,"Chandana");
		s.put(11,"Chandu");
		s.remove(11);
		System.out.println(s);
		
		Map<Integer,String> s1=new TreeMap<Integer,String>();  //ordered
		s1.put(12,"Chandana");
		s1.put(11,"Chandu");
		System.out.println(s1);
	}

}
