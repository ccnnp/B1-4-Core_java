package abst;

class Example11  //final class Example11
	{
		void display()
		{
			System.out.println("Hello Students");
		}
	}
	public class Example3 extends Example11
	{
		void display()
		{
			
			System.out.println("Welcome to C2TC");
		}

		public static void main(String[] args) 
		{
			Example2 e=new Example2();
			e.display();

		}

}
