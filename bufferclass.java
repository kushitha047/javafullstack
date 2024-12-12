***
string using stringbuffer class
output:
super
supersoftware
***
package arrays;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=new String("super");
        s.concat("software");
        System.out.println(s);
        StringBuffer sb=new StringBuffer("super");
        sb.append("software");
        System.out.println(sb);
	}

}
