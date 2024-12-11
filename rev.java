***
reverse order by using temp
output:
b=[70,5,20,10]
***
package arrays;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=0;
		int end=3;
		int arr[]= {10,20,5,70};
		String sample="";
		System.out.print("b=[");
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<=3;i++)
		{
			sample=sample+arr[i]+",";
			//System.out.print(sample);
		}
		System.out.print(sample.substring(0, sample.length()-1));
		System.out.print("]");
	}

}
