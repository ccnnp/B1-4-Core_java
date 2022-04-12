package exception;

import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=n/0;
		System.out.println(res);  
		s.close();
	}
}
