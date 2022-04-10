package interface1;

interface Example2
{
	void display();
}
public class Example1 implements Example2
{
	public void display()
	{
		System.out.println("Hello Chandana");
	}
	public static void main(String[] args) 
	{
		Example1 m=new Example1();
		m.display();
	}
}

