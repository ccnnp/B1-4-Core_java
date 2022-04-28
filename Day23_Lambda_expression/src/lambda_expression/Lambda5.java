package lambda_expression;

interface D
{
	public String print(String message); 
}
public class Lambda5 
{

	public static void main(String[] args) 
	{
		//Lambda expression with return
		D obj = (String message)->
		{
			return message;
		};
		System.out.println("My name is: " +obj.print("Chandana"));
	}

}
