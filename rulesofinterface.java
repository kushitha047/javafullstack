***
rules of interface example
output:
inside add method of calculator1
inside sub method of calculator1
***
package interfaces;
interface calculator1{
	int a=10;
	void add();
	void sub();
}

interface calculator3 extends calculator1{
	void mull();
	void div();
}
interface calculator4{
	void add1();
	void add2();
}
class samplecode1 implements calculator1{
	@Override
	public void add() {
		System.out.println("inside add method of samplecode1");
	}
	@Override
	public void sub() {
		System.out.println("inside sub method of samplecode1");
	}
	
}
class samplecode2 implements calculator1{
	@Override
	public void add() {
		System.out.println("inside add method of samplecode2");
	}
	@Override
	public void sub() {
		System.out.println("inside sub method of samplecode2");
	}
}
class samplecode3 implements calculator1,calculator3{
	@Override
	public void add() {
		System.out.println("inside add method of samplecode3");
	}
	@Override
	public void sub() {
		System.out.println("inside sub method of samplecode3");
	}@Override
	public void mull() {
		System.out.println("inside mull method of samplecode3");
	}
	@Override
	public void div() {
		System.out.println("inside div method of samplecode3");
	}
}
interface calculator5{
	
}
class samplecode4 {
	void display() {
		System.out.println("inside display method");
	}
}
class samplecode5 extends samplecode4 implements calculator1{
	@Override
	public void add() {
		System.out.println("inside add method of samplecode5");
	}
	@Override
	public void sub() {
		System.out.println("inside sub method of samplecode5");
	}
}
interface calculator6{
	void addition();
	void subtraction();
	default void multiplication() {
		System.out.println("inside multiplication method of calculator6");
	}
	static void division() {
		System.out.println("inside division method of calculator6");
	}
}
abstract class samplecode6 implements calculator6{
	@Override
	public void addition() {
		System.out.println("inside addition method of samplecode6");
	}
}

public class c4 {
	public static void main (String[] args) {
		calculator1 c2;
		calculator1 c3 =new calculator1() {
			@Override
			public void add() {
				System.out.println("inside add method of calculator1");
			}
			@Override
			public void sub() {
				System.out.println("inside sub method of calculator1");
			}
		};
		c3.add();
		c3.sub();
	}

}
