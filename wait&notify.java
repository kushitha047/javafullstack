***
wait and notify methods
output:
Thread name:Oddvalue:1
Thread name:Evenvalue:2
Thread name:Oddvalue:3
Thread name:Evenvalue:4
Thread name:Oddvalue:5
Thread name:Evenvalue:6
Thread name:Oddvalue:7
Thread name:Evenvalue:8
Thread name:Oddvalue:9
Thread name:Evenvalue:10
***
package racecondition;

public class numbers implements Runnable {
	static int count=1;
	Object obj;
	public numbers(Object obj) {
		super();
		this.obj=obj;
	}
	@Override
	public void run(){
		while(count<=10) {
			if(count%2==0 && Thread.currentThread().getName().equals("Even")&&count<=10){
				synchronized(obj) {
					System.out.println("Thread name:"+Thread.currentThread().getName()+"value:"+count);
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					try {
						obj.wait();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("Odd")&&count<=10) {
				synchronized(obj){
					System.out.println("Thread name:"+Thread.currentThread().getName()+"value:"+count);
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					try {
						obj.notifyAll();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
public class f7 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Object lock=new Object();
		numbers n1=new numbers(lock);
		numbers n2=new numbers(lock);
		Thread t1=new Thread(n1);
		Thread t2=new Thread(n2);
		t1.setName("Even");
		t2.setName("Odd");
		t1.start();
		t2.start();
//		new Thread(n1,"Even").start();
//		new Thread(n2,"Odd").start();
	}

}
