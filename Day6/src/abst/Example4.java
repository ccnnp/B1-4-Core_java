package abst;

class Example12
{
	void display()  //final void display()     method overriding
	{
		System.out.println("Hello students");
	}
}

public class Example4 extends Example12
{
	void display()
	{
		System.out.println("Welcome to C2TC");
	}
	public static void main(String[] args) 
	{
		Example4 e=new Example4();
		e.display();
	}

}
