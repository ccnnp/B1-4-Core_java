package exception;

public class Example5 
{
	static void display(int age, int weight)
	{
		if(age>18 && weight>50)	
			System.out.println("Eligible to donate blood");
		else
		throw new ArithmeticException("Not eligible");
	}
	public static void main(String[] args) 
	{
		display(17,55);
		System.out.println("Exception handle");
	}

}
