***
vowels count
output:
6
***
package arrays;

public class k2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="hEllo good morning";
        int vowelcount=0;
        for(int i=0;i<words.length();i++) {
        	char ch=Character.toLowerCase(words.charAt(i));
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		vowelcount++;
        	}
        }
        System.out.println(vowelcount);
	}

}
