***
threads
output:
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
main thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
child thread
***
package array;

public class mythread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}

}
public class d5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread t=new mythread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}

	}

}
