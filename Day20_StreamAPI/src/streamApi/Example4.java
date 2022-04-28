package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4 
{

	public static void main(String[] args) 
	{
		List<String> values = Arrays.asList("A", "B", "C", "D");

	    Optional<String> var = values.stream().findFirst();

	    assertTrue(var.isPresent());
	    assertThat(var.get(), is("A"));
	    System.out.println(values);
	}

	private static void assertTrue(boolean present) {
		// TODO Auto-generated method stub
		
	}

}
