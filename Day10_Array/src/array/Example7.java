package array;

public class Example7 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},{2,4,6},{1,3,5}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
