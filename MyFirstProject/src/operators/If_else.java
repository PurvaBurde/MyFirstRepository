package operators;

public class If_else {

	public static void main(String[] args) {
		
		//to check whether number is even or odd
		
		int var1=10;
		
		if (var1%2==0) {
			//java will calculate the remainder by %2
			//java will then compare the remainder value with 0 by ==0
			/*then decide whether if condition is true or false,
			  if true then it will print the statement inside the if loop*/
			
			System.out.println("This is even number ");
		}else {
			System.out.println("This is odd number "); //it will not print if the 'if condition' is true
		}

	}

}
