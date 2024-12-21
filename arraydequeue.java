***
arraydequeue collection framework program
output:
[30, 10, 10, 70]
[30, 10, 10, 70]
[10, 10, 70]
[10, 10]
true
***
package racecondition;
import java.util.ArrayDeque;
public class f10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(10);
		ad.addFirst(30);
		ad.addLast(70);
		System.out.println(ad);
		ad.remove(2);
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		b=ad.contains(10);
		System.out.println(b);

	}

}
