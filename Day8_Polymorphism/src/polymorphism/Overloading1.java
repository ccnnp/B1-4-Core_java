package polymorphism;

public class Overloading1 
{
	
	void assign(int a, int b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	void assign(float a, float b)
	{
		System.out.println("Area of Rectangle:"+(a*b));
	}
	public static void main(String[] args) 
	{
		Overloading1 m=new Overloading1();
		m.assign(5,10);
		m.assign(10f,20f);

	}

}
