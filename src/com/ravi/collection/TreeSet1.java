package com.ravi.collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("ravi");
		ts.add("abhi");
		//ts.add(null); //Exception in thread "main" java.lang.NullPointerException
		ts.add("ravi");
		ts.add("rani");
		ts.add("john");
		
		ts.forEach(a -> System.out.println(a));
		
		System.out.println("============");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
