***
words reverse
output:
olleh doog gninrom 
***
package arrays;

public class k7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="hello good morning";
		String output="";
		String[] s=words.split(" ");
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {
				output+=s[i].charAt(j);
			}
			output=output+" ";
		}
		System.out.print(output);

	}

}
