package lambda_expression;

interface A
{
	void show();
}
/*class xyz implements A
{
	public void show()
	{
		System.out.println("Welcome to Lambda expression");
	}
}*/
public class Lambda1 
{
	public static void main(String[] args) 
	{
		A obj=()->
		{
			System.out.println("Welcome to Lambda expression");
		};
		obj.show();
	}
}
