package sample3;

public class Constructor1 
{

	String str;
	int a;
	Constructor1() //ordinary constructor
	{
		str="Welcome";
		a=10;
	}
	void display()
	{
		System.out.println(str+" "+a);
	}
	public static void main(String[] args) 
	{
		Constructor1 c=new Constructor1();
		c.display();
	}
}
