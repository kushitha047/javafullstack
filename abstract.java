***
abstract class and objects
output:
plane takeoff
cargo plane is takeoff
plane landed
plane flew
***
package inheritance;

public abstract class plane {
	void takeoff() {
		System.out.println("plane takeoff");
	}
	abstract void fly();
	void land() {
		System.out.println("plane landed");
	}

}
public class cargoplane extends plane {
		// TODO Auto-generated method stub
	@Override
	void fly() {
		System.out.println("cargo plane is takeoff");
	}
	
}
public class c4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane p=new cargoplane();
		p.takeoff();
		p.fly();
		p.land();
		plane ref=new plane() { 
			@Override
			void fly() {
				System.out.println("plane flew");
			}
		};
		ref.fly();

	}

}
