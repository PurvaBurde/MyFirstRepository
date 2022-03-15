package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		//Map doesn't extends collection interface
		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		//To add object in map we use put method
		obj.put(1, "One"); //key-value pair= entry-->entry is sub interface of Map
		obj.put(2, "Two");
		//key cannot be duplicate if u do so it will overwrite
		obj.put(2, "Three");
		System.out.println(obj);
		//values can be duplicate but key can't
		obj.put(3, "Three");
		System.out.println(obj);
		
		//addall-->within collection this method is used to add one collection to another
		//putall-->it is similar to addall-->add one map in another
		
		HashMap<Integer, String> newmap=new HashMap<Integer, String>();
		newmap.putAll(obj);
		newmap.put(4, "One");
		newmap.put(1, "Five");
		System.out.println(newmap);
		
		
		/*HashSet<String> obj1=new HashSet<String>();
		obj1.add("One");
		obj1.add("Two");
		System.out.println(obj1);*/
		System.out.println();
		
		HashMap<String, Float> mapobj=new HashMap<String, Float>();
		mapobj.put("One", 1.0f);
		mapobj.put("Two", 2.0f);
		mapobj.put("two", 3.0f);
		System.out.println(mapobj);

		Set<Entry<String, Float>> entry=mapobj.entrySet();
		
		for(Map.Entry<String, Float> t:entry) {
			System.out.println(t.getKey());
			System.out.println(t.getKey()+ " "+t.getValue());
		}
		
	}

}
