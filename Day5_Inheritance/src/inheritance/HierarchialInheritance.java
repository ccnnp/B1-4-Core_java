package inheritance;

class CellPhones
{
	void message()
	{
		System.out.println("Hi, Chandana");
	}
	void call()
	{
		System.out.println("I am calling Chandana");
	}
}
class Samsung extends CellPhones
{
	void facelock()
	{
		System.out.println("Modern Facelock");
	}
}
class Oneplus extends CellPhones
{
	void games()
	{
		System.out.println("PUBg");
	}
}
public class HierarchialInheritance 
{
	public static void main(String[] args) 
	{
		Oneplus c=new Oneplus();
		c.games();
		c.message();
		c.call();
		Samsung s=new Samsung();
		s.facelock();

	}

}
