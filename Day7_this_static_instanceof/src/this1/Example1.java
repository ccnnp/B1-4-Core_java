//to pass an argument in the constructor call

package this1;

public class Example1 
{
	String str;
	Example1(String str)
	{
		this.str=str;
	}

	public static void main(String[] args) 
	{
		Example1 e=new Example1("C2TC program");
		System.out.println(e.str);
	}
}

