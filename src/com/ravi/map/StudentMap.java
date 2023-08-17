package com.ravi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ravi.collection.Student;

public class StudentMap {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Ravi");
		Student s2 = new Student(102, null);
		Student s3 = new Student(103, "John");
		Student s4 = new Student(104, "Abhi");
		Student s5 = new Student(105, "Smith");

		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		map.put(5, s5);

		Set<Integer> keyset = map.keySet();

		for (Integer key : keyset) {
			System.out.println(map.get(key));
		}

		Set<Entry<Integer, Student>> entrySet = map.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
