package system;

import array.MultiDimensional;

public class SystemExample {

	public static MultiDimensional out;  //non-primitive data type
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.err.println("I am error");
		System.out.println(SystemExample.out);
		SystemExample.out=new MultiDimensional();
		System.exit(1);

	}

}
