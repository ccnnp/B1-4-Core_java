package recursion;

import java.util.Scanner;

public class SumOfDigits 
{
	static int sum_of_digits(int n)
	{
		if(n==0)
			return 0;
		return(n%10 + sum_of_digits(n/10));
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int result = sum_of_digits(n);
		System.out.println("Sum of digits in " + n + " is " + result);  
		s.close();
	}

}
