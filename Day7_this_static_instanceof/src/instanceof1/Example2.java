//any parent class which is inherited by child class is instance variable of child class

package instanceof1;

class Parent
{
	
}
class Child extends Parent
{
	
}

public class Example2 
{
		public static void main(String[] args) 
		{
			Child m=new Child();
			System.out.println(m instanceof Parent);
		}

}
