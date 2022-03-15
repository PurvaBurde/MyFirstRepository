package stringPackage;

public class StringBufferExample {

	public static void main(String[] args) {
		//To get access of string buffer methods we need to create object of that default StringBuffer class
		StringBuffer str=new StringBuffer();
		System.out.println("Length is "+str.length());
		StringBuffer obj=new StringBuffer("This is for testing");
		System.out.println("Length is "+obj.length());
		
		//StringBuffer specific method
		//Append----Append the new string in existing string //method overriding
		System.out.println(obj.append(34567));  //int return
		System.out.println(obj.append(true));   //boolean return
		
		//Delete will Delete the string with specific index
		System.out.println("Delete the string with specific index---- "+obj.delete(0, 10)); //int
		//DeleteCharAt will delete the string with specific character
		System.out.println("Delete the string with specific index---- "+obj.deleteCharAt(0)); //specific char
		
		//insert(offset,string) will insert the string at specified mentioned position
		System.out.println(obj.insert(5, " Example")); //offset--from where we have to insert,string--what to insert
		
		//replace(start,end,string)will replace the string at specified deleted position
		//replace will delete from start to end, then insert specified string
		System.out.println(obj.replace(0, 10, "string")); //start,end,string
		
		//Reverse will reverse the string
		System.out.println(obj.reverse());
	}

}
