***
sorted order
output:
[5, 3, 7, 2]
[2, 3, 5, 7]
***
package arrays;
import java.util.Arrays;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,3,7,2};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}

}
