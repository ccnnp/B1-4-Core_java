package abst;

class Wild_animal
{
	void message()
	{
		System.out.println("This is Lion");
	}
}
class Pet_animal extends Wild_animal
{
	void message()
	{
		System.out.println("This is Dog");
	}
	void display()
	{
		message();
		super.message();
	}
}
public class Example6
{
	public static void main(String[] args) 
	{
		Pet_animal n=new Pet_animal();
		n.display();
	}

}
