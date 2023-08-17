package com.ravi.collection;

import java.util.LinkedHashSet;

public class LinkHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add(null);
		lhs.add(30);
		lhs.add(20);
		lhs.add(null);
		lhs.add(10);
		
		lhs.forEach( a-> System.out.println(a));
		
	}

}
