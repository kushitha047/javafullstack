***
single inheritance
output:
Hello
World
Hello World
***
package inheritance;

public class one {
	public void print_hello() {
		System.out.println("Hello");
	}
	public void print_hello_world() {
		System.out.println("Hello World");
	}

}
public class two extends one {
	public void print_world() {
		System.out.println("World");
	}

}
public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two t=new two();
		t.print_hello();
		t.print_world();
		t.print_hello_world();

	}

}
