package exception;

public class Example4 
{
	public static void main(String[] args) 
	{
		try
		{
			int res=10/5;
			System.out.println(res); 
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception handler");
		}
		finally
		{
			System.out.println("Exception handler in Java");
		}
	}
}
