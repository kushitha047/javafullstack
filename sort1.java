***
given elements are in sorted order or not
output:
sorted
***
package arrays;

public class sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
        boolean sorted=false;
        for(int i=0;i<3;i++)
        {
        	if(arr[i]<arr[i+1])
        	{
        		//System.out.println(sorted);
                sorted=true;
        	}
        	else
        	{
        		System.out.println("not sorted");
        		sorted=false;
        		break;
        	}
        }
        if(sorted==true)
        {
        	System.out.println("sorted");
        }
	}

}
