package annotations;
class Parent
{
	void accept()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	@Override
	void accept()
	{
		System.out.println("Child class");
	}
}
public class Example1 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.accept();
	
	}

}
