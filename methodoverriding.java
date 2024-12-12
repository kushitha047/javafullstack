***
method overriding
output:
the rate of interest of SBI is:9
the rate of interest of AXIS is:8
the rate of interest of HDFC is:7
***
package arrays;
class bank{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends bank{
	@Override
	int getRateOfInterest() {
		return 9;
	}
}
class AXIS extends bank{
	@Override
	int getRateOfInterest() {
		return 8;
	}
}
class HDFC extends bank{
	@Override
	int getRateOfInterest() {
		return 7;
	}
}
public class a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SBI b1=new SBI();
        AXIS b2=new AXIS();
        HDFC b3=new HDFC();
        System.out.println("the rate of interest of SBI is:"+b1.getRateOfInterest());
        System.out.println("the rate of interest of AXIS is:"+b2.getRateOfInterest());
        System.out.println("the rate of interest of HDFC is:"+b3.getRateOfInterest());
	}

}
