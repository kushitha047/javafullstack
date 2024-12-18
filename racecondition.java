***
rece condition 
output:
typing
typing
typing
typing
typing
spellcheck
spellcheck
spellcheck
spellcheck
spellcheck
saving
saving
saving
saving
saving
***
package racecondition;

public class MSoffice extends Thread {
	public void typing() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("typing");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	public void spellcheck() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("spellcheck");
				Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	public void saving() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("saving");
				Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	public void run() {
		try {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();	
		}
		else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();	
		}
		else {
			saving();
		}
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
public class f1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MSoffice ms1=new MSoffice();
		MSoffice ms2=new MSoffice();
		MSoffice ms3=new MSoffice();
		Thread t1=new Thread(ms1);
		Thread t2=new Thread(ms2);
		Thread t3=new Thread(ms3);
		t1.setName("typing");
		t2.setName("spellcheck");
	    t3.setName("saving");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		

	}

}
