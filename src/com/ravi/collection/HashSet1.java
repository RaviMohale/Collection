package com.ravi.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Ravi");
		hs.add("Abhi");
		hs.add("John");
		hs.add(null);
		hs.add("Rani");
		hs.add(null);
		hs.add("Rani");
		
		hs.forEach(a -> System.out.println(a));
		
		hs.remove(null);
		System.out.println("============");
		hs.forEach(a -> System.out.println(a));
		System.out.println("=============");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}