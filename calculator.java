***
 calculator
***
import java.util.Scanner;
class Add
{
   public static void main(String args[])
   {
	int a;
	int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("addition is:"+(a+b));
        System.out.println("subtraction  is:"+(a-b));
	System.out.println("multiplication is:"+(a*b));
	System.out.println("Division is:"+(a/b));
	System.out.println("module is:"+(a%b));
   }
}
