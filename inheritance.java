***
inheritance methods
output:
parent eats
child is sleep
parent runs 5km
child swims
***
package string;

public class paren {
	void eat() {
		System.out.println("parent eats");
	}
	void sleep() {
		System.out.println("parent sleeps");
	}
	void run() {
		System.out.println("parent runs 5km");
	}
}
public class chil extends paren {
	void sleep() {
		System.out.println("child is sleep");
	}
	void swims() {
		System.out.println("child swims");
	}

}
public class b8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chil c=new chil();
		c.eat();
		c.sleep();
		c.run();
		c.swims();

	}

}
