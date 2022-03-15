package collection;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Object> obj=new Vector<Object>();
		obj.addElement("String");
		obj.add("Testing");
		System.out.println(obj);
		System.out.println(obj.firstElement());
		
		 Enumeration<Object> abc =obj.elements();
		System.out.println(abc.hasMoreElements()); //collection has elements or not-->boolean
		System.out.println(abc.nextElement()); //to access the element one by one
		System.out.println(abc.nextElement());
		System.out.println();
		
		
//...........................................Stack...............................................
		Stack<Object> obj1=new Stack<Object>();
		obj1.push("Testing"); //push-->add
		obj1.push("second");
		obj1.add("Three");
		System.out.println(obj1);
		
		obj1.pop(); //pop-->delete 
		System.out.println(obj1);
		
		System.out.println(obj1.peek());
		System.out.println(obj1.empty()); //given collection is empty or not-->boolean
		System.out.println(obj1.search("second")); //search the index of given element
		
	}

}
