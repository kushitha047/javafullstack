***
multilevel inheritance
output:
one eats
two sleeps
three runs
***
package inheritance;

public class ones {
	public void eat() {
		System.out.println("one eats");
	}

}
public class twos extends ones{
	public void sleep() {
		System.out.println("two sleeps");
	}

}
public class threes extends twos {
	public void run() {
		System.out.println("three runs");
	}

}
public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threes t=new threes();
		t.eat();
		t.sleep();
		t.run();
	}

}
