package polymorphism;

public class Function_overloading 
{
	void assign(int a)
	{
		System.out.println("Area of Square:"+(a*a));
	}
	void assign(int a, int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	public static void main(String[] args) 
	{
		Function_overloading m=new Function_overloading();
		m.assign(5);
		m.assign(5,10);
	}

}
