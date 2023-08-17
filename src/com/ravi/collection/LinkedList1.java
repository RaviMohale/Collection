package com.ravi.collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(null);
		li.add(20);
		li.add(30);
		li.add(40);
		
		System.out.println(li);
		li.add(1, 50);
		System.out.println(li);
		System.out.println(li.getLast());
		System.out.println("==============");
		
		li.forEach(a -> System.out.println(a));

	}

}
