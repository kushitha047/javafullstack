***
one dimensional array
output:
enter the name of employee no:1
kushi
enter the name of employee no:2
kav
enter the name of employee no:3
yogi
enter the name of employee no:4
sarada
enter the name of employee no:5
ammu
kushi
kav
yogi
sarada
***
import java.util.Scanner;
class oneD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the name of employee no:"+(i+1));
            arr[i]=sc.next();
        }
        for(String name:arr)
        {
            System.out.println(name);
        }
    }
}
