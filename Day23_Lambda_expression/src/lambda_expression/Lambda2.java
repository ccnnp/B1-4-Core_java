package lambda_expression;

interface B
{
	void show(int a);
}

public class Lambda2 
{

	public static void main(String[] args) 
	{
		B obj=(int a)->
		{
			System.out.println("Welcome to Lambda expression "+ a);
		};
		obj.show(5);

	}

}
