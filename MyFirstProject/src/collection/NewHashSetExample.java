package collection;

import java.util.HashSet;
import java.util.Iterator;

public class NewHashSetExample {

	public static void main(String[] args) {
		System.out.println(".....................set-hashset..........................");
		HashSet<String> obj=new HashSet<String>();
		obj.add("First icecream");
		obj.add("Second icecream");
		obj.add("Third icecream");
		obj.add("First icecream"); //duplicate object-->it will overwrite existing object
		System.out.println(obj);
		System.out.println("I am copying obj collection in another collection");
		
		//Explicit casting---> non-primitive
		HashSet<String> obj1=(HashSet<String>) obj.clone();
		System.out.println(obj1); 
		System.out.println("Clone without casting-->"+ obj.clone());
		
		obj.remove("Second icecream");
		System.out.println(obj);
		
		System.out.println(obj.size()); //returns number of elements
		
		obj.iterator();
		Iterator<String> iteratorobj=obj.iterator();
		while(iteratorobj.hasNext()) {
			System.out.println(iteratorobj.next());
		}
	}

}
