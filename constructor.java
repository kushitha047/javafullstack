***
constructor in java
output:
civic
red
500000
120
japan
***
package string;

public class car {
	private String name;
	private String color;
	private int cost;
	private int topspeed;
	private String country;
	car(String a,String b,int c,int d,String e){
		super();
		name=a;
		color=b;
		cost=c;
		topspeed=d;
		country=e;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getCost() {
		return cost;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public String getCountry() {
		return country;
	}

}
public class b4 {
	public static void main(String args[]) {
		car c=new car("civic","red",500000,120,"japan");
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
		System.out.println(c.getTopspeed());
		System.out.println(c.getCountry());
	}

}

