package annotations;
import java.lang.annotation.Documented;

@Documented
@interface Main { String value(); }
@CustomAnnotation("GFG")

public class Example6 
{
	 public static void main(String[] args)
	 {
		 System.out.println("This is the main function");
	 }
}
