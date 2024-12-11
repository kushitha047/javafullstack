***
one and zeros order with camma separation
output:
b=[1 ,1 ,0 , 0 ]
***
package arrays;

public class ku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,1,0};
		System.out.print("b=[");
		for(int i=0;i<=3;i++) {
			if(arr[i]==1) {
				System.out.print(arr[i]+" ,");
			}
		}
		for(int i=0;i<=3;i++) {
			if(arr[i]!=1){
				System.out.print(arr[i]+" ");
			}
			if ( i>=2 && i<3) {
	            System.out.print(", ");
			}
		}
		
        System.out.print("]");
	}

}
