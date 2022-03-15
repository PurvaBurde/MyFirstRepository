package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(1);
		obj.add(1); //duplicates not allowed
		obj.add(13); 
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(15);
		System.out.println(obj);
		
		//Descending iterator-->iterate in descending order
		Iterator<Integer> iterator=obj.descendingIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ ",");
		}
		System.out.println();
		//DescendingSet-->Get the set in descending order
		System.out.println(obj.descendingSet());
		
		//headset will give values less than mentioned value
		System.out.println(obj.headSet(6));
		
		//ceiling method will only retrieve single object, greater than or equal to given element
		System.out.println(obj.ceiling(3));
		System.out.println(obj.ceiling(7)); //15-->last value
		System.out.println(obj.ceiling(17)); //null-->if collection doesn't have equal or greater object

		//Floor method will only retrieve single object, less than or equal to given element
		System.out.println(obj.floor(3));
		System.out.println(obj.floor(7)); 
		System.out.println(obj.floor(17));
		
		//Strictly higher value-->strictly greater than given element
		System.out.println(obj.higher(5));
		
		//Strictly lesser value-->strictly less than given element
		System.out.println(obj.lower(5));
		
		//it will retrieve & delete first element from collection //retrieval+deletion operation
		System.out.println(obj.pollFirst());
		System.out.println(obj);
		//it will retrieve & delete first element from collection //retrieval+deletion operation
		System.out.println(obj.pollLast());
		System.out.println(obj);
		
		//subset--> first>=given value<last
		System.out.println(obj.subSet(4, 13)); 
		
		System.out.println(obj);
	}
}
