***
using static keyword program
output:
hello
100
200
300
________________
hello2
1001
2001
3001
10001
20001
30001
________________
1001
2001
3001
***
package arrays;

public class test {

	static int a,b,c;
	int m,n,o;
	static {
		System.out.println("hello");
		a=100;
		b=200;
		c=300;
	}
	{
		System.out.println("hello2");
		a=1001;
		b=2001;
		c=3001;
		m=10001;
		n=20001;
		o=30001;
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
public class a7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println("________________");
		test t=new test();
		t.display1();
		System.out.println("________________");
		test.display();

	}

}
