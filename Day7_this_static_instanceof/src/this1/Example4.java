//to return the current class instance

package this1;

public class Example4 
{
	String str;
	Example4()
	{
		str="Chandana";
	}
	// method to return parent class instance
	Example4 get()
	{
		return this;
	}
	void display()
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		Example4 n=new Example4();
		//n.get.display();
		n.display();
	}

}
