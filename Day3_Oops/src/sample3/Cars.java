package sample3;

public class Cars 
{
	String c1,c2,c3;
	Cars()
	{
		c1="Audi";
		c2="BMW";
		c3="Mercedes";
	}
	void display()
	{
		System.out.println("This is " +c1);
		System.out.println("This is " +c2);
		System.out.println("This is " +c3);
	}

	public static void main(String[] args) 
	{
		Cars c=new Cars();
		c.display();
	}

}
