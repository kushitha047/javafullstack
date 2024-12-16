***
exception handling with specific catch
output:
division operations
enter the numerator
4
enter the denominator
0
arithmetic exception occured
***
package interfaces;
import java.util.InputMismatchException;
import java.util.Scanner;
public class c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("division operations");
			System.out.println("enter the numerator");
			int num=sc.nextInt();
			System.out.println("enter the denominator");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println(res);
			System.out.println("array operation");
			System.out.println("enter the array size");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("enter position number");
			int pos=sc.nextInt();
			System.out.println("enter the value to be added");
			int val=sc.nextInt();
			arr[pos]=val;
			System.out.println("data added");
			}
		catch(InputMismatchException e1) {
			System.out.println("input is not valid");
			
		}
		catch(ArithmeticException e2) {
			System.out.println("arithmetic exception occured");
		}
		catch(NegativeArraySizeException e3) {
			System.out.println("array size cannot be negative");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("specified index is out of range");
		}
		catch(Exception e) {
			System.out.println("exception handled in generic method");
		}
	}

}
