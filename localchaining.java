***
local chaining 
output:
rocky
goa
22
156.7
62.0
***
package string;

public class human {
	private String name;
	private String location;
	private int age;
	private double height;
	private double weight;
	human(String a,String b,int c,double d,double e){
		this("ramu","banglore",21,176.9);
		name=a;
		location=b;
		age=c;
		height=d;
	    weight=e;
	}
	human(String a,String b,int c,double d){
		this("kav","hyderabad",20);
		name=a;
		location=b;
		age=c;
		height=d;
	}
	human(String a,String b,int c){
		name=a;
		location=b;
		age=c;
	    }
	public String getname()
	{
		return name;
	}
	public String getlocation()
	{
		return location;
	}
	public int getage()
	{
		return age;
	}
	public double getheight()
	{
		return height;
	}
	public double getweight()
	{
		return weight;
	}
	}
public class b6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h=new human("rocky","goa",22,156.7,62);
		System.out.println(h.getname());
		System.out.println(h.getlocation());
		System.out.println(h.getage());
		System.out.println(h.getheight());
		System.out.println(h.getweight());

	}

}
