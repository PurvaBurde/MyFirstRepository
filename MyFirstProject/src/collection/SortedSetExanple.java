package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetExanple {

	public static void main(String[] args) {
		//Sorted set is interface so cannot create object, but it is implemented by TreeSet
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
		
		System.out.println(obj.first()); //it returns first object
		System.out.println(obj.last()); //it returns last object
		System.out.println(obj.headSet(6)); //it tells the value less than mentioned value
		System.out.println(obj.tailSet(3)); //it tells the value greater than mentioned value + the mentioned value
		System.out.println(obj.subSet(4, 13)); //it will retrieve partial set based on start & end position 
										//in which starting value is considered set-[1,2,3,4,5,6,15] subset-[2,3,4,5,6]
		
	}

}
