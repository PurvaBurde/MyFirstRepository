package zzzPractice;
import abstraction.FirstAbstactClass;

public class CastingExample {
	
	public static void main(String[] args) {
		int var1=55;
		byte var2=(byte)var1;
		
		CastingExample p=new ExplicitNonPrimitive();
		ExplicitNonPrimitive c= (ExplicitNonPrimitive) p;
		
	}

}
 class ExplicitNonPrimitive extends CastingExample{
	 
	 
 }
