package constructor;

public class ConstructorPractice {
	
	int a;
	int b;
	boolean c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorPractice obj=new ConstructorPractice(); //there is constructor after new
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj=new ConstructorPractice(56);
	}
	public ConstructorPractice() {   //no parameterized Constructor
		System.out.println("I am no parameterized constructor ");
		a=345; 
		b=238; 
		c=true;
	}
	public ConstructorPractice(int a) {   // parameterized Constructor
		System.out.println("I am parameterized constructor " + a);
		a=34; 
		b=33;
		c=true;
	}
public void M1() {
		System.out.println("I am from M1 ");
		this.M1();
	}
}

class Constructor2{
	public static void main(String[] args) {
		Constructor2 obj2=new Constructor2();
		
	}
	public void M1() {
		this.M1();
		System.out.println("I am from M1 from constructor2 ");
	}
}
