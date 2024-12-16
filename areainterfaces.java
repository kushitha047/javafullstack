***
areas using interfaces
output:
collected
calculated
displayed
enter the radius:
4
area of circle:50.36304
enter the length:
3
enter the breadth:
6
area of circle:18.0
enter the side:
6
area of circle:36.0
***
package interfaces;

interface shape {
	void collectdata();
	void calculate();
	void display();

}
import java.util.Scanner;
public class circle implements shape {
	static double pi=3.14769;
	double r;
	double area;
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=sc.nextDouble();
	}
	@Override
	public void calculate() {
		area=pi*r*r;
	}
	@Override
	public void display() {
		System.out.println("area of circle:"+area);
	}
}
public class square implements shape {
	double s;
	double area1;
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side:");
		s=sc.nextDouble();
	}
	@Override
	public void calculate() {
		area1=s*s;
	}
	@Override
	public void display() {
		System.out.println("area of circle:"+area1);
	}
}
public class rectangle implements shape {
	double l;
	double b;
	double area2;
	@Override
	public void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		l=sc.nextDouble();
		System.out.println("enter the breadth:");
		b=sc.nextDouble();	}
	@Override
	public void calculate() {
		area2=l*b;
	}
	@Override
	public void display() {
		System.out.println("area of circle:"+area2);
	}
}
import inheritance.circle;
import inheritance.rectangle;
import inheritance.triangle;

public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new shape() {
			@Override
			public void collectdata() {
				System.out.println("collected");
			}
			@Override
			public void calculate() {
				System.out.println("calculated");
			}
			@Override
			public void display() {
				System.out.println("displayed");
			}
		};
		s1.collectdata();
		s1.calculate();
		s1.display();
		circle c=new circle();
		c.collectdata();
		c.calculate();
		c.display();
		rectangle r=new rectangle();
		r.collectdata();
		r.calculate();
		r.display();
		square t=new square();
		t.collectdata();
		t.calculate();
		t.display();

	}

}
