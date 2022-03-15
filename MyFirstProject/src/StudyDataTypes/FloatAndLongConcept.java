package StudyDataTypes;

//This class is to expalin the concept of Float and Long 
//You can write the Float in two ways one without f suffix and other with f suffix
//If you don't write the f suffix , it will consider as double by default
//Same is for Long data type , one is with L suffix and other is without L suffix
//If you don't write L suffix , it will be consider as int not the long

public class FloatAndLongConcept {
	//float var1 without f suffix 
		public float var1=12;
		//Long without L suffix
		//public long  var2=2147483648; // Value is more than interger size it will throw error 
		//float var3 with f suffix
		public float var3=12.3456f;
		//Float var4 with Long suffix 
		public long  var4=2147483648l; // Value is more than interger size it will not throw error 
		public static void main(String[] args) {
		
			FloatAndLongConcept obj=new FloatAndLongConcept();
			System.out.println("Float Value " + obj.var1);
			//System.out.println("Hello World!" + obj.var2);
			System.out.println("Float Value " + obj.var3);
			System.out.println("Hello World! " + obj.var4);
		
	}
}
