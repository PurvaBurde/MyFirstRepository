package abstraction;

public class ChildClassAbstract extends FirstAbstactClass {

	public void M2() {
		System.out.println("abstract method M2 implemented in child class by inherritance");
	}
	public void M3() {
		System.out.println("abstract method M3 implemented in child class by inherritance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassAbstract xyz=new ChildClassAbstract();
		xyz.M1();
		xyz.M2();
		xyz.M3();
	}

	
//...........................constructor..................................//
	public ChildClassAbstract() {
		System.out.println("child class Constructor");
	}
}
