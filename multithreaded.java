***
multithreaded program
output:
task 2:printing operation started
kushitha
task 3:banking operation started
enter account number
task 1:addition operation started
enter the first number
kushitha
kushitha
kushitha
kushitha
task 2:printing operation completed
4
enter the second number
5
enter the pincode
324
result is:328
task 1:addition operation completed
yogesh
yogesh
yogesh
yogesh
yogesh
345
account details recorded
task 3:banking operation completed
kav
kav
kav
kav
kav
***
package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class operations extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("print")) {
			print();
		}
		else {
			bank();
		}
	}
	public void add() {
		try {
			Scanner sc=new Scanner(System.in);
		    System.out.println("task 1:addition operation started");
			System.out.println("enter the first number");
			int num1=sc.nextInt();
			System.out.println("enter the second number");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("result is:"+res);
			System.out.println("task 1:addition operation completed");
			for(int i=0;i<5;i++) {
				System.out.println("yogesh");
			}
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
	public void print() {
		try {
			System.out.println("task 2:printing operation started");
			for(int i=0;i<5;i++) {
				System.out.println("kushitha");
				Thread.sleep(1000);
			}
			System.out.println("task 2:printing operation completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void bank() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("task 3:banking operation started");
			System.out.println("enter account number");
     		int acc=sc.nextInt();
			System.out.println("enter the pincode");
			int pin=sc.nextInt();
			System.out.println("account details recorded");
			System.out.println("task 3:banking operation completed");
     		for(int i=0;i<5;i++) {
				System.out.println("kav");
			}
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
		
	}
		

}
public class d7 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		operations op1=new operations();
		operations op2=new operations();
		operations op3=new operations();
		op1.setName("add");
		op2.setName("print");
		op3.setName("bank");
		op1.start();
		op2.start();
		op3.start();

	}

}
