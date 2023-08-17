package com.ravi.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(40);

		System.out.println(al);

		System.out.println(" using for loop");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

			System.out.println("=====  for each loop approach =========");

			for (Object obj : al) {
				System.out.println(obj);

				System.out.println("======  using iterator =======");

				Iterator it = al.iterator();
				{
					while (it.hasNext()) {
						System.out.println(it.next());

						System.out.println("==========using ListIterator ================");
						ListIterator lt = al.listIterator();
						while (lt.hasNext()) {
							System.out.println(lt.next());

							System.out.println("=========forEach() approach ==========");
							
							al.forEach(a -> {
								System.out.println(a);
							});
						}
					}
				}
			}
		}

	}

}
