package decisionmaking;

import java.util.Scanner;

public class Example2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c)
			System.out.println(a);
		else if(b>a && a>c)
			System.out.println(b);
		else
			System.out.println(c);
		s.close();

	}

}