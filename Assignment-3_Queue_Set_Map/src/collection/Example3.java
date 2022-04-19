package collection;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Queue;
public class Example3 
{

	public static void main(String[] args) 
	{
		int i;
		Queue<Integer>queue=new ArrayDeque<Integer>();
		for(i=10;i<15;i++)
		{
			queue.add(i);
		}
		System.out.println(queue);
		((ArrayDeque<Integer>) queue).addLast(20);
		System.out.println("deque:" +queue);
		Iterator<Integer> itr = queue.iterator();
		System.out.println("Iterating elements");
		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
	}

}
