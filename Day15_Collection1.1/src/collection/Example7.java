package collection;

import java.util.ArrayList;
import java.util.Vector;

public class Example7 {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(3);
		a.add("Methods");
		a.add("Java");
		a.add(4);
		Vector v=new Vector();
		v.addAll(a);
		System.out.println(a);
	}

}
