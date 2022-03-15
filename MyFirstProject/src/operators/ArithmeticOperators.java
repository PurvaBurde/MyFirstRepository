package operators;

public class ArithmeticOperators {

	public static void main(String[]args) {
		ArithmeticOperators obj=new ArithmeticOperators();
		obj.add(8, 3);
		obj.sub(10, 3);
		obj.multi(8, 2);
		ArithmeticOperators.division(6, 3);
		ArithmeticOperators.modulus(7);
	}
	//for arithmetic operator +
	public void add(int a, int b) {
		System.out.println("addition is "+ (a+b));
	}
	//for arithmetic operator -
	public void sub(int a, int b) {
		System.out.println("substraction is "+ (a-b));
	}
	//for arithmetic operator *
	public void multi(int a, int b) {
		System.out.println("multiplication is "+ (a*b));
	}
	//for arithmetic operator /
	public static void division(int a, int b) {
		System.out.println("division is "+ (a/b));
	}
	//for arithmetic operator % 
	//this gives the remainder of the division
	public static void modulus(int a) {
		System.out.println("modulus is "+ (a%2));
	}
}
