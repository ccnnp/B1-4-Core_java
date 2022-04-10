package interface1;

public interface Example2 
{
	public void myMethod();
}
interface Example3
{
	public void myOtherMethod();
}

class DemoClass implements Example2, Example3
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
class Main1
{
	public static void main(String[] args)
	{
		DemoClass m=new DemoClass();
		m.myMethod();
		m.myOtherMethod();
	}
}