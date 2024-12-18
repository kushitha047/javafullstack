***
collection framework of ArrayList
output:
[556, 20, kus, 53, true, 20.634, [34, null, 123]]
[34, null, 123]
[30, 20, 40]
[30, 20]
***
package racecondition;

import java.util.ArrayList;

public class f8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		al1.add(30);
		al1.add(20);
		al1.add(40);
		ArrayList al2=new ArrayList();
		al2.add(34);
		al2.add(null);
		al2.add(123);
		ArrayList al3=new ArrayList();
		al3.add(20);
		al3.add("kus");
		al3.add(true);
		al3.add(20.634);
		al3.add(al2);
		al3.add(0,556);
		al3.add(3,53);
		System.out.println(al3);
		System.out.println(al2);
		System.out.println(al1);
		al1.remove(2);
		System.out.println(al1);

	}

}
