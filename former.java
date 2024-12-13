***
former program
output:
enter the principal amount :
200000
enter the time in years:
2
the simple interest is:10000.0
***
package string;
import java.util.Scanner;
public class farmer {
	double principle;
	static double rate;
	double time;
	double simpleInterest;
	static {
		rate=2.5;
	}
	void CollectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal amount :");
		principle=sc.nextDouble();
		System.out.println("enter the time in years:");
		time=sc.nextDouble();
	}
	void Calculate() {
		simpleInterest=(principle*time*rate)/100;
	}
	void Display() {
		System.out.println("the simple interest is:"+simpleInterest);
	}

}
public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		farmer f=new farmer();
		f.CollectData();
		f.Calculate();
		f.Display();
	}

}
