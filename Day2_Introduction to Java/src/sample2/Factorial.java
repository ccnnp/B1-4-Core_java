package sample2;
import java.util.Scanner;
public class Factorial {
	static int factorial(int n)
	{    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
	 }   
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;    
		 fact = factorial(n);   
		 System.out.println("Factorial of "+n+" is: "+fact);    
		 s.close();
		 }  
	
}


