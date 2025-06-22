package day2;

import java.util.HashSet;

public class Hashmap {

	public static void main(String[] args) {
		
		HashSet<Integer> has = new HashSet<>();
		

		has.add(1);
		has.add(2);
		has.add(4);
		has.add(5);
		has.add(3);
		has.add(7);
		has.add(8);
		
		System.out.println(has);
		for(Integer num:has) {
			System.out.print(num+" ");
		}
	}

}
