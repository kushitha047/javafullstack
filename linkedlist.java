***
linked list collection program
output:
[50, ineuron]
[hello, 50, ineuron, 99, bangalore]
[ineuron, 99, bangalore]
[ineuron, 99]
99
ineuron
***
package racecondition;
import java.util.LinkedList;
import java.util.ListIterator;

public class f9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(50);
		ll.add("ineuron");
		System.out.println(ll);
		ll.addFirst("hello");
		ll.add(3,99);
		ll.addLast("bangalore");
		System.out.println(ll);
		ll.remove("hello");
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
//		ListIterator litr1=ll.listIterator();
//		while(litr1.hasNext()) {
//			System.out.println(litr1.next());
//		}
		ListIterator litr1=ll.listIterator(ll.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
	}

}
