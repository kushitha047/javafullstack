***
producer and consumer program
output:
data retrieved... the data value is:527232
data retrieved... the data value is:527233
data retrieved... the data value is:527234
data retrieved... the data value is:527235
data retrieved... the data value is:527236
data added...the data value is:515573
data added...the data value is:515574
data added...the data value is:515575
data added...the data value is:515576
data added...the data value is:515577
data added...the data value is:515578
data added...the data value is:515579
data added...the data value is:515580
data added...the data value is:515581
data retrieved... the data value is:527237
data retrieved... the data value is:527238
data retrieved... the data value is:527239
data retrieved... the data value is:527240
data retrieved... the data value is:527241
data retrieved... the data value is:527242
data retrieved... the data value is:527243
data retrieved... the data value is:527244
data retrieved... the data value is:527245
***
package racecondition;

public class queue {
	int data;
	public void put(int i) {
		data=i;
		System.out.println("data added...the data value is:"+i);
	}
	public void get(int i) {
		data=i;
		System.out.println("data retrieved... the data value is:"+i);
	}

}
public class Producer extends Thread {
	queue a;
	public Producer(queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.put(i);
			i++;
		}
	}

}
public class Consumer extends Thread{
	queue b;
	public Consumer(queue q) {
		b=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			b.get(i);
			i++;
		}
	}


}

public class f5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q=new queue();
		(new Producer(q)).start();
		(new Consumer(q)).start();
	}

}
