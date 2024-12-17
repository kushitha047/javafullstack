***
throw keyword
output:
enter the numerator:
4
enter the denominator:
0
exception from different function
***
package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ShowException();
		}
		catch(ArithmeticException e1) {
			System.out.println("exception from different function");
		}
		catch(InputMismatchException e2) {
			System.out.println("input is not valid");
			
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
		static void ShowException() {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the numerator:");
				int num=sc.nextInt();
				System.out.println("enter the denominator:");
				int deno=sc.nextInt();
				int res=num/deno;
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
			catch(ArithmeticException e1) {
				throw e1;
			}
			catch(InputMismatchException e2) {
				throw e2;
			}
			catch(NegativeArraySizeException e3) {
				throw e3;
			}
			catch(ArrayIndexOutOfBoundsException e4) {
				throw e4;
			}
			catch(Throwable e) {
				throw e;
			}
		}

	}

