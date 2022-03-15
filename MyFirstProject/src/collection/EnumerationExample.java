package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<String> obj=new Vector<String>();
		obj.add("First icecream");
		obj.add(1,"Second icecream");
		obj.addElement("Third icecream"); 
		obj.addElement("Fourth icecream");  
		
		System.out.println("....................iteration through enumeration interface........................");
		Enumeration<String> enumeration=obj.elements();
		//enumeration is holding total three object
		//hasMoreElement-->check whether there are elements in collection or not-->boolean
		//nextElement-->to access the element one by one
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		System.out.println(obj);
		System.out.println("....................iteration through iterator interface........................");
		Iterator<String> abc=obj.iterator();
		while(abc.hasNext()) {
			System.out.println(abc.next());
			abc.remove();  //to remove the elements from collection-->last element remove
		}
		System.out.println(obj);
		
		System.out.println("....................iteration through ListIterator interface........................");
		ListIterator<String> listiterator=obj.listIterator();
		
		
	}
}
