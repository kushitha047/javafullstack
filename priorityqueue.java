***
priority queue collection progarm
output:
[20, 29, 34]
[10, 20, 34, 44, 29, 64]
[10, 29, 34, 44, 64]
true
***
package racecondition;
import java.util.PriorityQueue;
public class f11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		PriorityQueue pq=new PriorityQueue();
		pq.add(29);
		pq.add(20);
		pq.add(34);
		System.out.println(pq);
		pq.add(44);
		pq.add(10);
		pq.add(64);
		System.out.println(pq);
		pq.remove(20);
		System.out.println(pq);
		b=pq.contains(29);
		System.out.println(b);
	}

}
