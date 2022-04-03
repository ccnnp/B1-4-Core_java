package decisionmaking;

import java.util.Scanner;

public class Switch_case 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1: 
			System.out.println("Bengaluru");
			break;
		case 2:
			System.out.println("Mysuru");
			break;
		case 3:
			System.out.println("Kolar");
			break;
		default:
			System.out.println("Invalid input");
		s.close();
		}
	}
}
