package collection;

import java.util.TreeMap;

public class NavigableMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> obj=new TreeMap<Integer, String>();
		obj.put(1, "One");
		obj.put(2, "two");
		obj.put(6, "three");
		obj.put(4, "four");
		obj.put(5, "five");
		
		System.out.println(obj);
		
		System.out.println(obj.ceilingKey(6)); //key values
		System.out.println(obj.ceilingEntry(3));
		
		System.out.println(obj.descendingMap());
		System.out.println(obj.descendingKeySet());
		
		System.out.println(obj.subMap(2, 5));
		
	}
}
