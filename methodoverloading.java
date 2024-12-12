***
method overloading
output:
30
60
30.22
30.11
30.329998
330.5499993133545
330.44000061035155
240.32999965667724
***
package arrays;
class calc{
    int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}
	double add(float a,int b,double c) {
		return a+b+c;
	}
	double add(float a,double b,int c) {
		return a+b+c;
	}
}
public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=20,c=30;
        float a1=10.11f,b1=20.22f,c1=30.33f;
        double a2=100.11,b2=200.22,c2=300.33;
        calc s = new calc();
        System.out.println(s.add(a,b));
        System.out.println(s.add(a,b,c));
        System.out.println(s.add(a,b1));
        System.out.println(s.add(a1,b));
        System.out.println(s.add(a1,b1));
        System.out.println(s.add(a,b1,c2));
        System.out.println(s.add(a1,b,c2));
        System.out.println(s.add(a1,b2,c));
        
	}

}
