package abstraction;

public interface InterfaceWithDefaultMethod {

	//This is default method
	default void DefaultMethod() {
		System.out.println("I am default method ");
	}
	
	//Even interface support implementation you access modifier should be public
	//no other access modifier supports
	public default void DefaultMethod(int a) {
		System.out.println("I am default method ");
	}
}
