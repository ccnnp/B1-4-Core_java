package looping;

import java.util.Scanner;

public class Forloop 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}
		
	}
}
