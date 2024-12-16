***
exception
output:
enter the numerator:
4
enter the denominator:
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at interfaces.c6.main(c6.java:12)
***
package interfaces;
import java.util.Scanner;
public class c6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator:");
		int num=sc.nextInt();
		System.out.println("enter the denominator:");
		int deno=sc.nextInt();
		int res=num/deno;
		System.out.println(res);

	}

}
