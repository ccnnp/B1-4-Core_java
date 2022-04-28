package lambda_expression;

interface E
{
	public int mul(int x,int y);
}
public class Lambda6 
{

	public static void main(String[] args) 
	{
		//Lambda expression without return
		E obj = (x,y)->(x*y);
		System.out.println(obj.mul(2,3));
	}

}
