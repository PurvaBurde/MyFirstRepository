package collection;

import java.util.ArrayList;

public class LifeWithoutGeneric {

	public static void main(String[] args) {
		ArrayList<String> t=new ArrayList<String>(); //added <String> later //it is called generics
		//t.add(1);
		t.add("String");
		System.out.println(t);
		
		String p=(String) t.get(0);
		System.out.println(p.toLowerCase());
		
	}

}
