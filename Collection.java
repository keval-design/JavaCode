package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Collection {

	public static void main(String[] args) {

		  ArrayList<Integer> al = new ArrayList();
		  LinkedList<String> list = new LinkedList<>();

	// addition	  
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	// deletion
	al.remove(0);
	al.remove(1);
	
	
	// searching
	
	System.out.println(al.contains(2));
	System.out.println(al.contains(2));
	
	// sorting
	
	for(int num : al) {
		System.out.println(num);
	}
	System.out.println(al);
	
	// Linked list example 
	//addtion
	list.add("masai");
	list.add("keval");
	list.add("rathod");
	list.add("mehul");
	list.add("rutvik");
	//deletion
	list.remove(0);
	list.remove(1);
	
	//searching
	
	System.out.println(list.contains("masai"));
	System.out.println(list.contains("rathod"));
	
	// sorting
	
	
	for(String name : list) {
		System.out.println(name);
	}
		
	}

}
