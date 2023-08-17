package com.ravi.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, null);
		map.put(102, "Ravi");
		map.put(103, "Smith");
		map.put(104, "David");
		System.out.println("Map size : " + map.size());
		System.out.println(map.get(103));
		System.err.println(map.get(101));
		
		System.out.println("================");
		Collection<String> values = map.values();
		for(String s : values) {
			System.out.println(s);
		}
		System.out.println(" ===========  Convert map into set (Keyset entryset)============== ");
		
		Set<Integer> keyset = map.keySet();
		for(Integer key :keyset) {
			System.out.println(key  + "  == " + map.get(key));
			
			System.out.println("=========== entry set =============");
			Set<Entry<Integer,String>> entrySet = map.entrySet();
			for(Entry<Integer,String> entry : entrySet ) {
				System.out.println(entry.getKey() + "---"  +entry.getValue());
			}
			
			
		}
	}

}
