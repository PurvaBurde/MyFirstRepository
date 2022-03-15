package stringPackage;

public class StringEqual {
	public static String var="A";
	public static String var1="A";
	public static String var3="a";

	public static void main(String[] args) {
		String var2=new String("A");
		
		// == ------>compare object
		System.out.println("compare object by == "+var==var1);
		System.out.println("compare object by == "+var==var2);
		
		// Equals ---->compare String
		System.out.println("compare string values by equals with boolean return  "+var.equals(var1));
		System.out.println("compare string values by equals with boolean return  "+var.equals(var2));
		
		//CompareTo is nothing but equals method which gives return as int  //compares 1st char
		System.out.println("compare string by ascii value by compareTo with int return  "+var.compareTo(var1));
		System.out.println("compare string by ascii value by compareTo with int return  "+var.compareTo(var2));
		//ascii value of A=65, a=-97---> -32 i.e.(65-97=-32)
		System.out.println("compare string by ascii value by compareTo with int return "+var.compareTo(var3));  
		
		
	}

}
