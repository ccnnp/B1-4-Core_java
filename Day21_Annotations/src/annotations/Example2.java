package annotations;

import java.util.ArrayList;

public class Example2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList e=new ArrayList<>();
		e.add(10);
		e.add("Chandana");
		System.out.println(e);
	}

}
