package streamApi;
import java.util.*;
import java.util.stream.*;

public class Example1 
{

	public static void main(String[] args) 
	{
		//Integer[] arr=new Integer[] {1,2,3};
		//Stream<Integer> obj=Arrays.stream(arr);
		List<Integer> values=Arrays.asList(1,2,3);
		List<Integer>var=values.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(var);
	}

}
