package multithreading;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread Interruption");
	}
}
public class Example3 
{

	public static void main(String[] args) 
	{
		Thread1 t=new Thread1();
		t.start();
		t.interrupt();
	}

}



//interrupt
//interrupted 
//isinterrupted programs