***
concat function in string
output:
hello hi
hello morning
***
package arrays;

public class k4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1=new String("hello ");
        str1.concat("good");
        String str2=str1.concat("morning");
        str1=str1.concat("hi");
        System.out.println(str1);
        System.out.println(str2);
	}

}

