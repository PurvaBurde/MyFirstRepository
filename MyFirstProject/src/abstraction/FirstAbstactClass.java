package abstraction;

//Whenever you add abstract non access modifier in class it becomes abstract class

public abstract class FirstAbstactClass {
	
	int a;        // abstract class can have instance variable
	static int b; // abstract class can have static variable
	
	public void M1() {
			System.out.println("There is no abstract method in M1");
		}
	
	public abstract void M2();
	public abstract void M3();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FirstAbstactClass obj=new FirstAbstactClass();
		  // i.e. you cannot create object of abstract class
		    // 
	}

//...........................constructor..................................//
	public FirstAbstactClass() {
		System.out.println("abstract class but can have Constructor");
	}
}
