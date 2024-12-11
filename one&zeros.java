***
sorted
output:
rearranged numbers:
1 1 1 1 0 0 
***
package arrays;

public class add {

	public static void main(String[] args) {
		int[] a= {1,0,1,1,0,1};
		int count=0;
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
			    count++;	
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if (i<count)
			{
				a[i]=1;
			}
			else
			{
				a[i]=0;
			}
		}
		System.out.println("rearranged numbers:");
		for(int num:a)
		{
			System.out.print(num+" ");
		}

	}

}
