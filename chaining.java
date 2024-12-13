***
chaining in constructor
output:
inside the parent constructor
inside the child constructor
***
package string;

public class parent {
	parent(){
		super();
		System.out.println("inside the parent constructor");
	}
}

public class child extends parent {
	child(){
		System.out.println("inside the child constructor");
	}

}
public class b5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1=new child();

	}

}
