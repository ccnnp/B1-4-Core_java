package collection;

import java.util.Vector;

public class Example8 {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add("Technical");
		v.add("Technology");
		v.add(3);
		v.setElementAt(4,1);
		System.out.println(v);
	}

}
