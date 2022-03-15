package staticInterface;

public class Math implements InterfaceWithStaticAndDefault,NewInterfaceWithStaticAndDefault {

	public static void main(String[] args) {
		Math obj=new Math();
		obj.Add(6, 7);
		obj.Sub(6, 7);
		InterfaceWithStaticAndDefault.Multiplication(4,9);
	}

	//Both interfaes is having same abstract method but while implementing we need only one implementation
	public void Add(int a, int b) {
		System.out.println("abstract method implementation "+(a+b));
	}
	//we have to specify the interface with super keyword or override the default method to avoid method ambiguity
	public void Sub(int a, int b) {
		InterfaceWithStaticAndDefault.super.Sub(100,98);
		
	}

	//in main method, we have to call static method by interface name only
	//i.e. InterfaceWithStaticAndDefault.Multiplication(4,9);
	static void Multiplication(int a, int b) {
		
	}
}
