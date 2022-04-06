package abst;
abstract class Animal
{
	abstract void eat();
}
class Herbivores extends Animal
{
	void eat()
	{
		System.out.println("I am vegetarian");
	}
}
class Carnivores extends Animal
{
	void eat()
	{
		System.out.println("I am non-vegetarian");
	}
}
public class Example1 {

	public static void main(String[] args) 
	{
		Herbivores h=new Herbivores();
		Carnivores c=new Carnivores();
		h.eat();
		c.eat();
	}
}
