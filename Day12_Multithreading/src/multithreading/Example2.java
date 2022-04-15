package multithreading;

class A
{
	void print(int num)
	{
		synchronized(this)
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(num*i);
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.print(10);
	}
}
public class Example2 
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B(a);
		B b1 = new B(a);
		b.start();
		b1.start();
	}

}
