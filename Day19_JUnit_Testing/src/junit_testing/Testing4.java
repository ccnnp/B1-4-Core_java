package junit_testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Testing4 
{
	@BeforeAll
	static void display()
	{
		System.out.println("Chandana");
	}
	
	@Test
	void display1()
	{
		System.out.println("Chandu");
	}
}
