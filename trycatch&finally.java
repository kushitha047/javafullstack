***
try,catch and finally method
output:
enter the numerator:
4
enter the denominator:
0
exception handled
inside finally block
***
package interfaces;

import java.util.Scanner;

public class c7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int num=sc.nextInt();
			System.out.println("enter the denominator:");
			int deno=sc.nextInt();
			int res=num/deno;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
		finally {
			System.out.println("inside finally block");
		}

	}

}
