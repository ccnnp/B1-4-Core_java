package enum1;
enum Bike
{
	Pulsar,KTM,Duke,R15,R153
}
public class Example3 
{

	public static void main(String[] args)
	{
		Bike b=Bike.Pulsar;
		switch(b)
		{
			case Pulsar:
				System.out.println("You chose Pulsar");
				break;
			case KTM:
				System.out.println("You chose KTM");
				break;
			case Duke:
				System.out.println("You chose Duke");
				break;
			case R15:
				System.out.println("You chose Pulsar");
				break;
			default:
				System.out.println("Invalid");
		}
	}

}
