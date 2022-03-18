package logics;

 class MethodOverLoadingPractice{

	public static void main(String[] args) {
		
		System.out.println("I am from java main ");
		MethodOverLoadingPractice.main(3);
		MethodOverLoadingPractice obj=new MethodOverLoadingPractice();
		obj.square(12.23, 23);
		obj.square(23, 12.23);
		 //both the parameter is float
	}
	//byte--short--int--long--float--double
	//whether we can overload the main method
	public static void main(int a) {
		System.out.println("I am from programmer main ");
	}
	//instance/non-static ---how many parameter-2
	//return type -void
	//method name -square
	//data type -both is having double
	public void square(double b, int c) {
		
		double a= b*c;
		System.out.println("I am trying to do multiplication" + a);
	}
	//non-static---no of parameter -2
	//return type-void
	//data type--int and double
	//method name-square
	public void square(int b, double c) {
		
		double a= b*c;
		System.out.println("I am trying to do int multiplication" + a);
	}

}
