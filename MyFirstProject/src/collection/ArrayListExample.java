package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		
		obj.add("This is string"); //This will add the string object
		obj.add(2);//this will add integer object
		obj.add(null);
		System.out.println(obj);
		
		ArrayList<Object> obj1=new ArrayList<Object>();
		obj1.add("New collection");
		System.out.println(obj1);
		
		//This method is used to add one collection into another collection
		obj.addAll(obj1);
		System.out.println("After adding obj1 collection in obj "+ obj);
		
		//To remove mentioned index by mentioning index from a collection
		obj.remove(1);
		System.out.println("After removing by index "+ obj);
		
		//To remove mentioned collection by object from another collection
		obj.removeAll(obj1);
		System.out.println("After removing the collection of obj1 from obj "+ obj);
		
		//to clear all the collections from mentioned obj
		obj.clear();
		System.out.println(obj);
		
		obj.add(4);
		obj.add(25);
		System.out.println(obj);
		
		//to check whether given collection contains mentioned value or not
		System.out.println(obj.contains(4)); //......... output in boolean
		
		//get
		//collection stores objects. //Object comes non-primitive
		//obj collection represents Object class object.
		//obj.get(0);  ............Integer type
		//Object p=obj.get(0); //homogeneous statement
		Integer t=(Integer) obj.get(0); //Integer object so type casting is mandatory 
										//Integer is wrapper class which represents object of int
		System.out.println("with casting get "+t);
		System.out.println("without casting get "+obj.get(0));
		//set
		obj.set(0, 24); //value at index 0 will replace the value with 24
		obj.set(1, 50);
		System.out.println(obj);
		
		
	}

}
