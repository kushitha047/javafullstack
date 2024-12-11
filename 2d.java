***
two dimensional array
output:
enter the name of employee :1
kushi
enter the name of employee :2
kav
enter the name of employee :3
yogi
enter the name of employee :4
ammu
enter the name of employee :5
sarada
enter the name of employee :1
mani
enter the name of employee :2
yogesh
enter the name of employee :3
kushitha
enter the name of employee :4
kavya
enter the name of employee :5
soumya
company no.:1
kushi
kav
yogi
ammu
sarada
company no.:2
mani
yogesh
kushitha
kavya
soumya
  ***
  import java.util.Scanner;
class twoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] arr=new String[2][5];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("enter the name of employee :"+(j+1));
                arr[i][j]=sc.next();
            }
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("company no.:"+(i+1));
            for(int j=0;j<5;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        
    }
}
