package lambda_expression;

public class Lambda7 
{

	public static void main(String[] args) 
	{
		//thread example without Lambda expression
		/*Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("Lambda7");
			}
			
		};*/
		
		//thread example with Lambda expression
		Runnable r1= ()->
		{
			System.out.println("Lambda7");
		};
		Thread t=new Thread(r1);
		t.start();
	}

}
