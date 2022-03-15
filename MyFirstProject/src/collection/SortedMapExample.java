package collection;

import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> obj=new TreeMap<Integer, String>();
		obj.put(1, "One");
		obj.put(2, "two");
		obj.put(3, "three");
		obj.put(4, "four");
		obj.put(5, "five");
		
		System.out.println(obj);
		
		System.out.println(obj.firstKey());
		System.out.println(obj.lastKey());
		System.out.println(obj.headMap(3));
		System.out.println(obj.tailMap(3));
		System.out.println(obj.subMap(2, 4));
	}
}
