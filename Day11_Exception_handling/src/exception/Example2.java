package exception;

import java.util.Scanner;

public class Example2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		try
		{
			int res=n/0;
			System.out.println(res);  
		}
		catch(Exception e)
		{
			System.out.println("Exception handler");
		}
		finally
		{
			System.out.println("Exception handler in Java");
		}
		s.close();

	}

}
