package recursion;
import java.util.Scanner;
public class Example1 
{
	static int circle(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return(circle(n-1,k) + k-1)% n+1;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println("The best place is : "+circle(n,k));
		s.close();
	}

}
