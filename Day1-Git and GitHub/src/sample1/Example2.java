package sample1;
import java.util.Scanner;
public class Example2 {

	public static void main(String[] args) 
	{
		int a, b,result;
        char op;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Integers");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter an Operator");
        op = s.next().charAt(0);
 
        switch (op) {
        case '+':
        	result = a+b;
            System.out.println(a+ "+" +b+ "=" +result);
            break;
        case '-':
        	result = a-b;
            System.out.println(a+ "-" +b+ "=" +result);
            break;
        case '*':
        	result = a*b;
            System.out.println(a+ "*" +b+ "=" +result);
            break;
        case '/':
        	result = a/b;
            System.out.println(a+ "/" +b+ "=" +result);
            break;
        default:
            System.out.println("Unsupported Operation");
        }
        s.close();
	}

}
