***
area of circle
output:
enter the radius:
4
area is:50.24
***
package string;
import java.util.Scanner;
public class circle {
	static double pi;
	double radius;
	double area;
	static {
		pi=3.14;
	}
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:" );
		radius=sc.nextDouble();
	}
	void calculate() {
		area=pi*(radius*radius);
	}
	void display() {
		System.out.println("area is:"+area);
	}

}
public class b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.collectdata();
		c.calculate();
		c.display();

	}

}
