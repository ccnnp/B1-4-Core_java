package generics;

public class Generic_class<T>
{
	T val;
	public void print()
	{
		System.out.println(val.getClass().getName());
	}
	public static void main(String[] args) 
	{
		Generic_class<Integer> obj = new Generic_class<>();
		obj.val=15;
		obj.print();
	}

}
