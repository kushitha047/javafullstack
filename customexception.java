***
custom exception
output:
exception caught
new exception
***
package array;
class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class d3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("new exception");
		}
		catch(MyException ex) {
			System.out.println("exception caught");
			System.out.println(ex.getMessage());
		}

	}

}
***
example 2:
output:
exception caught
new exception
exception caught
new exception1
***
package array;

public class myexception extends Exception{
	public myexception(String s) {
		super(s);
	}

}
public class myexception1 extends Exception{
	public myexception1(String s1) {
		super(s1);
	}

}
public class d4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new myexception("new exception");
		}
		catch(myexception ex) {
			System.out.println("exception caught");
			System.out.println(ex.getMessage());
		}
		try {
			throw new myexception1("new exception1");
		}
		catch(myexception1 ex1) {
			System.out.println("exception caught");
			System.out.println(ex1.getMessage());
		}
		

	}

}
