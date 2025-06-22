package day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
	
		HashSet<Integer>  hs = new HashSet();
		LinkedHashSet<Integer> lk = new LinkedHashSet();
		TreeSet<Integer> tr = new TreeSet();
		
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
	
		System.out.println(hs);
		System.out.println("Size"+" "+hs.size());
		
		System.out.println("Linkehashset example");
		lk.add(1);
		lk.add(2);
		lk.add(3);
		lk.add(4);
		lk.add(5);
		
		System.out.println(lk.contains(2));
		
		System.out.println(lk);
		tr.add(1);
		tr.add(2);
		tr.add(3);
		tr.add(4);
		tr.add(5);
		
		tr.remove(1);
		
		
		
		
		System.out.println("Treeset example");

System.out.println(tr);
		
	}

}
