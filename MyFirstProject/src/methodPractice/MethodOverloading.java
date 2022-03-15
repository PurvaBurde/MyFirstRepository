package methodPractice;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.multiplication(10, 20);
		obj.multiplication(10.5, 2);
		obj.multiplication(876);
		obj.multiplication(5, 5.5);

	}
	public void multiplication(int a, int b) {
		int c= a*b;
		System.out.println("I am showing int int "+ c);
	}
	public void multiplication(double a, int b) {
		double c= a*b;
		System.out.println("I am showing double int "+ c);
	}
	public void multiplication(int a) {
		int c= a;
		System.out.println("I am showing int "+ c);
	}
	public void multiplication(int a, double b) {
		double c= a*b;
		System.out.println("I am showing int double "+ c);
	}
}
