***
three dimensional array
output:
organization no:1
company no.:1
enter the name of employee :1
kushi
enter the name of employee :2
kav
company no.:2
enter the name of employee :1
sarada
enter the name of employee :2
mani
organization no:2
company no.:1
enter the name of employee :1
ammu
enter the name of employee :2
soumya
company no.:2
enter the name of employee :1
harshi
enter the name of employee :2
anu
organization no:1
company no.:1
kushi
kav
company no.:2
sarada
mani
organization no:2
company no.:1
ammu
soumya
company no.:2
harshi
anu
***
import java.util.Scanner;
class threeD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][][] arr=new String[2][2][2];
        for(int i=0;i<2;i++)
        {
            System.out.println("organization no:"+(i+1));
            for(int j=0;j<2;j++)
            {
                System.out.println("company no.:"+(j+1));
                for(int k=0;k<2;k++)
                {
                   System.out.println("enter the name of employee :"+(k+1));
                    arr[i][j][k]=sc.next();
                }
            }
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("organization no:"+(i+1));
            for(int j=0;j<2;j++)
            {
                System.out.println("company no.:"+(j+1));
                for(int k=0;k<2;k++)
                {
                    System.out.println(arr[i][j][k]);
                }
            }
        }
        
    }
}
