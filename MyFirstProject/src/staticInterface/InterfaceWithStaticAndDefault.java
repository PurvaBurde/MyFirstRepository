package staticInterface;

public interface InterfaceWithStaticAndDefault {

	//Abstract method
	void Add(int a, int b);
	
	//default method
	default void Sub(int a, int b) {
		System.out.println(a-b);
	}
	
	//Static method
	static void Multiplication(int a, int b) {
		System.out.println(a*b);
	}


}
