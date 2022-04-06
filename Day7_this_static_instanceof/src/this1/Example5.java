//to invoke the current class constructor

package this1;

public class Example5 
{
	int a;
	int b;
	Example5()
	{
		this(10,20);
		System.out.println("Inside default constructor");
	}
	
	Example5(int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) 
	{
		Example5 n=new Example5();
	}

}
