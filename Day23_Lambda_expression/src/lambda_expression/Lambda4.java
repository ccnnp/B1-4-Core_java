package lambda_expression;

import java.util.ArrayList;

public class Lambda4 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj = new ArrayList<>();
		obj.add(12);
		obj.add(8);
		obj.add(15);
		System.out.println(obj);
		obj.forEach((n)->
		{
			System.out.println(n);
		});
	}

}
