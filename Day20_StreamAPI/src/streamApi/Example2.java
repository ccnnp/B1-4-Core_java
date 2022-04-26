package streamApi;

import java.util.Arrays;
import java.util.List;

public class Example2 
{

	public static void main(String[] args) 
	{
		List<Integer> values=Arrays.asList(10,10,1,22,3,3,8);
		values.stream().filter(i->i<10).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("Unique values are:"+i));
		values.stream().limit(4).forEach(i->System.out.println(i));
		values.stream().sorted().forEach(i->System.out.println(i));
	}

}
