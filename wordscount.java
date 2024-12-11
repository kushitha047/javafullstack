***
words count
output:
3
***
package arrays;

public class k1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String words="hello good morning";
        int count=0;
        for(int i=0;i<words.length();i++) {
        	if(words.charAt(i)==' ') {
        		count++;
        	}
        }
        System.out.println(count+1);
	}

}
