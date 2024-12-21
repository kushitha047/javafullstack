***
linkedhashmap
output:
{10=dhoni, 7=msd, 18=kohli, 2=sharma}
***
package racecondition;

import java.util.LinkedHashMap;

public class f16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm=new LinkedHashMap();
		hm.put(10, "sachin");
		hm.put(7, "msd");
		hm.put(18, "kohli");
		hm.put(2, "msd");
		hm.put(10, "dhoni");
		hm.put(2, "sharma");
		System.out.println(hm);

	}

}
