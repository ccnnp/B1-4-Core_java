package wrapper;

public class Example1 
{
	public static void main(String args[])
	{
		int a=20;
		Integer i=a;  //auto boxing
		Integer j=new Integer(10);
		System.out.println(a+" "+i+" "+j);
	}
}
