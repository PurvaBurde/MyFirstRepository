package stringPackage;

public class StringMethod {
	
	public static String var="TESTING";  //all uppercase
	public static String var1="testing"; //all lowercase
	//Method chaining is possible

	public static void main(String[] args) {
		
		//Length method is used to check the length of string
		//length calculation starts from 1
		System.out.println("Length of string "+ var.length());
		
		//Tell me the position of character within string
		//char take 1 parameter that is index which starts from 0, so 's' will print for position 2
		System.out.println("Character at 2nd position "+var.charAt(2));
		
		//Check whether string is empty or not
		System.out.println("string is empty or not "+var.isEmpty());   //method starts from 'is' then its return type is boolean
		
		//Checking whether 2 strings are equal or not
		System.out.println("2 strings are equal or not "+var.equals(var1)); //var=Testing, var1=testing #case sensitive
		System.out.println("2 strings are equal or not, no case sensitive "+var.equalsIgnoreCase(var1)); //not case sensitive
		
		//Checking whether string starts with "TES"
		System.out.println("Checking whether string starts with Tes "+var.startsWith("TES"));
		
		//var= uppercase to lowercase
		System.out.println("to convert into lowercase "+ var.toLowerCase());
		
		//var1= lowercase to uppercase
		System.out.println("to convert into lowercase "+ var1.toUpperCase());
		 
		//Checking whether string ends with "ING"
		System.out.println("Checking whether string ends with ing "+var.endsWith("ING"));
		
		//String is immutable, once created then cannot change it
		var.concat(" Software");
		System.out.println(var);  
		//but if we store it in other string then only we can print
		String a=var.concat(" Software");
		System.out.println(a);  //String is immutable
		
		//whether string contains TE or not
		System.out.println("string contains TE or not "+var.contains("TE")); //case sensitive, so true
		
		//Replacing of words, ex. manual testing replace with automation testing
		String var1="Manual Tester ";
		System.out.println("which word is replacing to which in string "+ var.replace("TES","nostring"));
		
		//split returns array of string  	//All returns will be String
		String var2="Manual Tester life is relax only package is problem";
		//If you want to use homogeneous data type in one variable---->Array //access array by using index bcz it stores the value in the form of index
		System.out.println(var2.split("p")[0] );	System.out.println(var2.split("n")[1] );
		
		//Trim will only remove front and back spaces but not the middle spaces 
		String var3="      Testing for the   space termination         ";
		System.out.println("String without trim" + var3);
		System.out.println("String with trim" + var3.trim());
		
		//String var="TESTING"====>0123456 //index of return type is int
		//whichever comes first, index of that string will print
		//if string is not found it will return -1
		System.out.println("index of given string from starting by (string) is "+var.indexOf("IN"));
		System.out.println("index of given string from starting by (string) is "+var.indexOf("TN"));
		
		System.out.println("index of given string from starting by ascii value (int ch) is "+var.indexOf(84));  //by ascii value
		
		System.out.println("index of given string from starting by (string,int fromIndex) is "+var.indexOf("T", 2));
		
		System.out.println("index of given string from ending by (string) is "+var.lastIndexOf("T"));
		
		//Substring will break your string according to index
		String var4="This is long string for testing purpose only";
		System.out.println("substring--> "+var4.substring(8));
		
		System.out.println("substring (startIndex,endIndex)--> "+var4.substring(8, 12));//include start from 8 but consider upto 11 end-1 position will be considered
		System.out.println("substring (startIndex,endIndex)--> "+var.substring(0, 3)); //starting index consider, end index - 1(minus 1)
		
		
	}

}
