package abst;

class A
{
	String name="Chandana";
}
class B extends A
{
	String name="Chandu";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);
	}
}
public class Example5 
{
	public static void main(String[] args) 
	{
		B n=new B();
		n.print();
	}

}
