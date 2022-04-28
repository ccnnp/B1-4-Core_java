package lambda_expression;

interface C
{
	abstract public void display(int a,int b);
}
public class Lambda3 
{

	public static void main(String[] args) 
	{
		C obj=(int a,int b)->
		{
			System.out.println("Addition of a and b is: "+(a+b));
		};
		obj.display(12,8);
	}

}
