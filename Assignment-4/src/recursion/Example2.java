package recursion;

import java.util.Scanner;

public class Example2 
{
	static int paths(int m, int n)
	{
		if(m==1 || n==1)
			return 1;
		else 
			return paths(m-1,n) + paths(m,n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println(paths(m,n));
		s.close();
	}

}
