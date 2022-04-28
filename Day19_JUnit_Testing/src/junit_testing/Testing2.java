package junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class Testing2 
{
	@Test
	public void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);	
	}
	
	@Test
	public void print1()
	{
		int a=1;
		int b=2;
		assertEquals(a,b);	
	}
}
