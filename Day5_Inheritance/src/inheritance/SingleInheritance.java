package inheritance;
class Parent 
{
	void print()
	{
		System.out.println("Hello,This is Chandana");	
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("SingleInheritance");
	}
}
class SingleInheritance
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display();
		c.print();
	}
}

