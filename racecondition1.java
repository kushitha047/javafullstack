***
race condition
output:
boy has entered the bathroom
boy is using the bathroom
boy is finished using bathroom
girl has entered the bathroom
girl is using the bathroom
girl is finished using bathroom
others has entered the bathroom
others is using the bathroom
others is finished using bathroom
***
package racecondition;

public class human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is finished using bathroom");
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class f2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		human boy=new human();
		human girl=new human();
		human others=new human();
		boy.setName("boy ");
		girl.setName("girl ");
		others.setName("others ");
		boy.start();
		boy.join();
		girl.start();
		girl.join();
		others.start();
		others.join(); 

	}

}
