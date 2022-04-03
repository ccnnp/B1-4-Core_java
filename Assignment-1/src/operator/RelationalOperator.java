package operator;

import java.util.Scanner;

public class RelationalOperator 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=a>b;
		boolean x=a<b;
		boolean y=(a==b);
		boolean z=(a>=b);
		boolean w=(a!=b);
		System.out.println(res);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		s.close();
	}
}
