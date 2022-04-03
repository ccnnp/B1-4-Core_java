package operator;

public class UnaryOperator   //++a,a++,--a,a--
{
	public static void main(String[] args) 
	{
		int a=5,b=3,x,y,z,p,q,r;
		x=a++;  //5
		y=++b;  //4
		z=a+x;  //6+5=11
		System.out.println(z);
		p=a--;  //5
		q=--b;  //2
		r=a-p;  //4-5=-1
		System.out.println(r);
	}
}
