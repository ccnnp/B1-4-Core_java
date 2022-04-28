package annotations;
class Parent1
{
	void print()
	{
		System.out.println("Hello");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Hey");
	}
}
public class Example3 {

	public static void main(String[] args) 
	{
		Parent1 p = new Parent1();
		p.print1();	
	}

}
