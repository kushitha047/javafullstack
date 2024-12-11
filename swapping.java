***
swapiing first to last
output:
minimum number:5
maximum number:70
sum of the given numbers:105
70
5
20
10
***
package arrays;
public class sample {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		int[] a= {10,20,5,70};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		    if (a[i]<min)
		    {
			    min=a[i];
		    }
		    if(a[i]>max)
		    {
		    	max=a[i];
		    }
		}
		System.out.println("minimum number:"+min);
		System.out.println("maximum number:"+max);
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of the given numbers:"+sum);
		for(int i=3;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
