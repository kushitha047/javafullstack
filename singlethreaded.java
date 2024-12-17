***
single threaded program
output:
task 2:printing operation started
kushitha
kushitha
kushitha
kushitha
kushitha
task 2:printing operation completed
task 1:addition operation started
enter the first number
2
enter the second number
8
result is:10
task 1:addition operation completed
task 3:banking operation started
enter account number
6
enter the pincode
46
account details recorded
task 3:banking operation completed
***
package array;

public class thread1 extends Thread{
	public void run() {
		System.out.println("task 2:printing operation started");
		for(int i=0;i<5;i++) {
			System.out.println("kushitha");
		}
		System.out.println("task 2:printing operation completed");
	}

}
import java.util.Scanner;
public class d6 {

	public static void main(String[] args) throws InterruptedException{
		thread1 t=new thread1();
		t.run();
		Scanner sc=new Scanner(System.in);
		System.out.println("task 1:addition operation started");
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("result is:"+res);
		System.out.println("task 1:addition operation completed");
		System.out.println("task 3:banking operation started");
		System.out.println("enter account number");
		int acc=sc.nextInt();
		System.out.println("enter the pincode");
		int pin=sc.nextInt();
		System.out.println("account details recorded");
		System.out.println("task 3:banking operation completed");
	}

}
