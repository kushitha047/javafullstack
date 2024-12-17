***
throws keyword
output:
Exception in thread "main" java.lang.ArithmeticException: you must be 18 or above 18 to vote
	at array.d2.checkage(d2.java:11)
	at array.d2.main(d2.java:7)
***
package array;

public class d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkage(14);
	}
	static void checkage(int age) throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("you must be 18 or above 18 to vote");
			
		}
		else {
			System.out.println("you are eligible for vote");
		}

	}

}

