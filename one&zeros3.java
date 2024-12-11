***
one&zeros order with temp variables
output:
b=[1 1 1 1 0 0 ]
***
package arrays;

public class kus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,0,1,0,1,1};
        int j=0;
        System.out.print("b=[");
        int temp[]=new int[arr.length];
        for(int i=0;i<=5;i++) {
        	if(arr[i]==1) {
        		temp[j]=1;
        		j++;
        	}
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("]");
	}

}
