package sample3;

public class Constructor 
{
	String str;
	int a;
	Constructor(String s, int x) //parameterized constructor
	{
		str=s;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) 
	{
		Constructor c=new Constructor("Welcome",10);
		c.display();

	}

}
