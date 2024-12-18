***
synchronized program
output:
Student1 acquired the resource:ak47
Student1 acquired the resource:m416
Student1 acquired the resource:awm
Student2 acquired the resource:ak47
Student2 acquired the resource:m416
Student2 acquired the resource:awm
***
package racecondition;

public class warrior extends Thread {
	String res1="ak47";
	String res2="m416";
	String res3="awm";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("student1")){
			Student1Acq();
		}
		else {
			Student2Acq();
		}
	}
	public void Student1Acq() {
		try {
			synchronized(res1) {
				System.out.println("Student1 acquired the resource:"+res1);
				Thread.sleep(3000);
			synchronized(res2) {
				System.out.println("Student1 acquired the resource:"+res2);
				Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("Student1 acquired the resource:"+res3);
				Thread.sleep(3000);
			}
			} 
		    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Student2Acq() {
		try {
			synchronized(res1) {
				System.out.println("Student2 acquired the resource:"+res1);
				Thread.sleep(3000);
			synchronized(res2) {
				System.out.println("Student2 acquired the resource:"+res2);
				Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("Student2 acquired the resource:"+res3);
				Thread.sleep(3000);
			}
			} 
		    }
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class f3 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		warrior w1=new warrior();
		warrior w2=new warrior();
		w1.setName("student1");
		w2.setName("student2");
		w1.start();
		w2.start();
	}

}
