***
abstract class and objects for circle,rectangle and triangle areas
output:
enter the radius:
4
area of circle:50.24
enter the length:
3
enter the breadth:
6
area of rectangle:18.0
enter the height:
7
enter the base:
3
area of triangle:10.5
data
calculate
dispaly
***
package inheritance;

public abstract class start {
	abstract void collectdata();
	abstract void calculate(); 
	abstract void display();

}
import java.util.Scanner;
public class circle extends start {
	static double pi=3.14;
	double radius;
	double area;
	@Override
	void calculate() {
		area=pi*radius*radius;
	}
	@Override
	void display() {
		System.out.println("area of circle:"+area);
	}
	@Override
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		radius=sc.nextDouble();
	}
	

}
import java.util.Scanner;
public class rectangle extends start {
	double length;
	double breadth;
	double area1;
	@Override
	void calculate() {
		area1=length*breadth;
	}
	@Override
	void display() {
		System.out.println("area of rectangle:"+area1);
	}
	@Override
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		length=sc.nextDouble();
		System.out.println("enter the breadth:");
		breadth=sc.nextDouble();
	}
	

}
import java.util.Scanner;
public class triangle extends start {
	double height;
	double base;
	double area2;
	@Override
	void calculate() {
		area2=(base*height)/2;
	}
	@Override
	void display() {
		System.out.println("area of triangle:"+area2);
	}
	@Override
	void collectdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		height=sc.nextDouble();
		System.out.println("enter the base:");
		base=sc.nextDouble();

	}

}
public class c5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.collectdata();
		c.calculate();
		c.display();
		rectangle r=new rectangle();
		r.collectdata();
		r.calculate();
		r.display();
		triangle t=new triangle();
		t.collectdata();
		t.calculate();
		t.display();
		start ref=new start() {
			@Override
			void collectdata() {
				System.out.println("data");
			}
	        @Override
	        void calculate() {
	        	System.out.println("calculate");
	        }
	        @Override
	        void display() {
	        	System.out.println("dispaly");
	        }
		};
		ref.collectdata();
		ref.calculate();
		ref.display();

	}

}
