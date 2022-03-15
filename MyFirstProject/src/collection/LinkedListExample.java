package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Object> obj=new LinkedList<Object>();
		obj.addFirst("String first"); //to add element at first position
		obj.add("Testing");
		obj.addLast("Checking"); //to add element at last position
		obj.add("Testing");
		obj.addLast("rere"); 
		obj.addFirst("String two");
		
		System.out.println(obj);
		
		obj.removeFirst();
		System.out.println(obj);
		obj.removeLast();
		System.out.println(obj);
		
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		
	}

}
