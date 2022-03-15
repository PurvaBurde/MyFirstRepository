package operators;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var=5;
		int var1=20;
		
		if (var<6 && var1<25) {
			System.out.println("I am satisfying the if condition");
		}
		
		if (var>6) {
			System.out.println("I am inside if loop");
		}
		
		System.out.println("I am outside if loop"); //it will print even after the 'if condition' is true

		//syntax of if loop
		/* if (condition) {
		 *   this block/body will only execute if condition is true
		 *   }
		*/
	}

}
