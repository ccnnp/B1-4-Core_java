//super() can be used to invoke immediate parent class constructor 

package abst;

class Person
{
	Person()
	{
		System.out.println("Person class constructor");
	}
}
class Student extends Person
{
	Student()
	{
	super();
	System.out.println("Student class constructor");
	}
}
public class Example7 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
	}

}
