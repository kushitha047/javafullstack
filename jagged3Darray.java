***
jagged3Darray
output:
enter the number of organizations:
2
enter the number of companies:
2
enter the number of employees in organization no:1company no:1
2
enter the number of employees in organization no:1company no:2
2
enter the number of employees in organization no:2company no:1
2
enter the number of employees in organization no:2company no:2
2
 inside organization no:1
inside company no:1
enter the name of employee no:1
kushi
enter the name of employee no:2
kav
inside company no:2
enter the name of employee no:1
yogi
enter the name of employee no:2
sarada
 inside organization no:2
inside company no:1
enter the name of employee no:1
mani
enter the name of employee no:2
ammu
inside company no:2
enter the name of employee no:1
anu
enter the name of employee no:2
harshi
 inside organization no:1
inside company no:1
kushi
kav
inside company no:2
yogi
sarada
 inside organization no:2
inside company no:1
mani
ammu
inside company no:2
anu
harshi
***
import java.util.Scanner;
class jagged3Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of organizations:");
        int m=sc.nextInt();
        System.out.println("enter the number of companies:");
        int n=sc.nextInt();
        String arr[][][]=new String[m][n][];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("enter the number of employees in organization no:"+(i+1)+"company no:"+(j+1));
                arr[i][j]=new String[sc.nextInt()];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" inside organization no:"+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("inside company no:"+(j+1));
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println("enter the name of employee no:"+(k+1));
                    arr[i][j][k]=sc.next();
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" inside organization no:"+(i+1));
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("inside company no:"+(j+1));
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println(arr[i][j][k]);
                }
            }
        }
    }
}
