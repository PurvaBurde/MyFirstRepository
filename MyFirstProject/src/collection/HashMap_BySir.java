package collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap_BySir {
	public static void main(String[] args) {
		//Map doesn't extend collection interface
		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		//To add object in map we use put method while in collection it is generally add method
		obj.put(1, "One"); //key-value pair
		obj.put(2, "Two");
		//Key cannot be duplicate but value can be 
		obj.put(2, "Three");// if you do some new value will overwrite the existing one
		System.out.println(obj);
		
		//You can have duplicate values there is no impact
		//As map delays based on key not on value
		obj.put(3, "Three");
		System.out.println(obj);
		
		//addall --within collection this method is used to add one collection in another
		//putall --it is similar to your addall --add one map in another
		
		HashMap<Integer, String> newmap=new HashMap<Integer, String>();
		newmap.putAll(obj);
		newmap.put(4, "One");
		newmap.put(1, "five");
		
		System.out.println(newmap);
		
		System.out.println("----------------------Map with String key -------");
		HashMap<String,Float> mapobj=new HashMap<String, Float>();
		mapobj.put("One", 1.0f);
		mapobj.put("Two", 2.0f);
		mapobj.put("Three", 3.0f);
		System.out.println(mapobj);
		mapobj.put("Two", 4.0f);
		//Don't overwrite the existing value
		mapobj.putIfAbsent("Two", 8.0f); //If key is not present then only add in map
		
		System.out.println(mapobj);
		
		//Key value is called as entry ---entry is sub interface of map
	
		//Remove the object based on key 
		System.out.println("mapobj before removal ");
		System.out.println(mapobj);
		mapobj.remove("Three");
		System.out.println("mapobj after removal ");
		System.out.println(mapobj);
		
		//Remove the object based on key and value
		System.out.println("mapobj before removal with key and value ");
		System.out.println(mapobj);
		mapobj.remove("One", 1.0f);
		System.out.println("mapobj after removal with key and value ");
		System.out.println(mapobj);
		
		mapobj.remove("Two",1.0f); //it will not perform delete operation as key two is not having 1.0f value in map
		System.out.println(mapobj);
		
		//mapobj.values().forEach(v->System.out.println("values"+ v));
		
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("One");
		obj1.add("Two");
		System.out.println(obj1);
		
		

	}

}
