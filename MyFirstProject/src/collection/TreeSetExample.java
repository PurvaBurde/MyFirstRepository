package collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//group of object represented as single entity where objects are stored in sorting order
		//TreeSet-->3,4,1,2,7-->it will store based on ascending order-1,2,3,4,7
		//Heterogeneous-->String,1,3.0,'c'-->it will not sort so in TreeSet Heterogeneous objects are not allowed
		
		TreeSet<Object> obj=new TreeSet<Object>();
		obj.add(1);
		//obj.add("String");//if u add heterogeneous object & try to print u will get runtime error//ClassCastException
		System.out.println(obj); 
		
		//In JDK 7 & above try to enter null value
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		//obj.add(null);//NullPointerException-->runtime
		System.out.println(obj1);		
	}
}
