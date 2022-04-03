//To find the sum of positive numbers

package looping;

import java.util.Scanner;

public class Dowhileloop 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int number=0;
		Scanner s=new Scanner(System.in);
		do {
			sum += number;
			System.out.println("Enter a number");
			number=s.nextInt();
		   }while(number >= 0);
		System.out.println("Sum = " + sum);
		s.close();
	}

}
