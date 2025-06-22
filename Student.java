package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	Integer id;
	Integer age;
	String name;
	Student(Integer id,Integer age,String name){
		this.id = id;
		this.age = age;
		this.name = name;
	}
	class AgeComparator implements Comparator<Student>{
		public int compare(Student s1,Student s2) {
			return s1.age - s2.age;
		}
	}

	public static void main(String[] args) {
	
		List<Student> list = new ArrayList<>();
		
list.add(new Student(1,22,"keval"));
list.add(new Student(2,23,"mohit"));
list.add(new Student(3,22,"ronak"));


Collections.sort(list, (s1, s2) -> s1.age - s2.age);



for(Student s : list) {
	System.out.println(s.name + "_"+s.age);
}
	}

}







	
	
