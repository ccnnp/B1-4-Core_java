package collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Example4 
{

	public static void main(String[] args) 
	{
		Set s=new HashSet();  //unordered
		s.add(10);
		s.add(null);
		System.out.println(s);
		
		Set s1=new LinkedHashSet();  //ordered
		s1.add(10);
		s1.add(null);
		System.out.println(s1);
	}

}
