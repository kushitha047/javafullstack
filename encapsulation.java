***
using get function set function / encapsulation
output:
dog name is:munna
dog color is:black
dog cost is:10000
dog age is:12
dog breed is:rotwiller
***
package string;

public class dog {
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getCost() {
		return cost;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	public String getBreed() {
		return breed;
	}

}
package string;

public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.setName("munna");
		d.setColor("black");
		d.setCost(10000);
		d.setAge(12);
		d.setBreed("rotwiller");
		System.out.println("dog name is:"+d.getName());
		System.out.println("dog color is:"+d.getColor());
		System.out.println("dog cost is:"+d.getCost());
		System.out.println("dog age is:"+d.getAge());
		System.out.println("dog breed is:"+d.getBreed());

	}

}
