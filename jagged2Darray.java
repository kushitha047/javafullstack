***
jagged2 dimensional array
output:
enter the number of companies:
2
enter the number of employees in company no:1
2
enter the number of employees in company no:2
2
 inside company no:1
enter the name of employee no:1
kushi
enter the name of employee no:2
kav
 inside company no:2
enter the name of employee no:1
yogi
enter the name of employee no:2
mani
 inside company no:1
kushi
kav
 inside company no:2
yogi
mani
***
import java.util.Scanner;
class jagged2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of companies:");
        int m=sc.nextInt();
        String arr[][]=new String[m][];
        for(int i=0;i<m;i++)
        {
            System.out.println("enter the number of employees in company no:"+(i+1));
            arr[i]=new String[sc.nextInt()];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" inside company no:"+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("enter the name of employee no:"+(j+1));
                arr[i][j]=sc.next();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" inside company no:"+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
