package com.ravi.map;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("one");
		ad.add("two");
		ad.add("three");
		ad.addFirst("ravi");
		System.out.println(ad);
		System.out.println("============");
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		
	}

}
