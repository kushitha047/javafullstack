***
hashmap program
output:
{18=kohli, 2=sharma, 7=msd, 10=dhoni}
kohli
sharma
msd
dhoni
18=kohli
2=sharma
7=msd
10=dhoni
***
package racecondition;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class f15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(10, "sachin");
		hm.put(7, "msd");
		hm.put(18, "kohli");
		hm.put(2, "msd");
		hm.put(10, "dhoni");
		hm.put(2, "sharma");
		System.out.println(hm);
//		for(Object obj:hm.entrySet()) {
//			System.out.println(obj);
//		}
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set s=hm.entrySet();
		Iterator itr2=s.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
