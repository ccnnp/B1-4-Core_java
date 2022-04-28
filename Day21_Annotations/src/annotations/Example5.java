package annotations;
import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited 
@interface CustomAnnotation
{
    String value() default "GFG";
}
@CustomAnnotation(value = "Sky is limitless")

class Super {
}

public class Example5 extends Super 
{
	
	public static void main(String[] arg) throws Exception
    {
		
		System.out.println(new Example5().getClass().getAnnotation(CustomAnnotation.class));
	    Class<Super> obj = Super.class;
	    printAnnotationState(obj);
    }

	private static void printAnnotationState(Class<Super> obj) 
	{
		
	}
}


