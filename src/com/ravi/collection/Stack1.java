package com.ravi.collection;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer> sk = new Stack<>();
		sk.push(100);
		sk.push(20);
		sk.push(300);
		sk.push(500);
		sk.push(null);
		sk.push(300);
		
		sk.forEach(a -> System.out.println(a));
		
		//sk.peek();
		System.out.println("===========");
		System.out.println(sk.peek());
		System.out.println("+++++++");
		System.out.println(sk.pop());
		System.out.println("===========");
		sk.forEach(a -> System.out.println(a));
	}

}
