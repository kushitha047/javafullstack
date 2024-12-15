***
hierarichal inheritance
output:
class A
class B
class A
class C
class A
class D
***
package inheritance;

public class a {
	public void print_a() {
		System.out.println("class A");
	}

}
public class b extends a{
	public void print_b() {
		System.out.println("class B");
	}

}
public class c extends a{
	public void print_c() {
		System.out.println("class C");
	}

}
public class d extends a {
	public void print_d() {
		System.out.println("class D");
	}

}
public class c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj_b=new b();
		obj_b.print_a();
		obj_b.print_b();
		c obj_c=new c();
		obj_c.print_a();
		obj_c.print_c();
		d obj_d=new d();
		obj_d.print_a();
		obj_d.print_d();

	}

}
