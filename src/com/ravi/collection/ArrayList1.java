package com.ravi.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1, "Raju"));
		al.add(new Student(0, null));
		al.add(new Student(2, null));
		al.add(new Student(3, "Ravi"));
		al.add(new Student(4, "John"));
		al.add(new Student(5, "Rani"));
		
		al.forEach(a -> {
			System.out.println(a.id +"  "  + a.name);
		});
		
		for(int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.stream().filter(a -> a.id > 2).forEach(a -> System.out.println(a.id +" "  +a.name));
		
		ListIterator<Student> li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("=====================");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
