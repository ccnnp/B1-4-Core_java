package interface1;

interface Example4
{
	public void myMethod();
}
interface Example5
{
	public void myOtherMethod();
}

class DemoClass implements Example4, Example5
{
	public void myMethod() 
	{
		System.out.println("Example2");
	}
	public void myOtherMethod()
	{
		System.out.println("Example3");
	}
}
public class Example3 
{
	public static void main(String[] args) 
	{
		DemoClass m=new DemoClass();
		m.myMethod();
		m.myOtherMethod();
	}
}
