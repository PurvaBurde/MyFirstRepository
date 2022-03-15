package method_overriding;

public class StaticMethodOverriding {
	
	public static void main(String[] args) {
		
		
	}

	public void M1() {
		System.out.println("I am from Parent");
	}	

}
class ChildClStatOverriding extends StaticMethodOverriding{
	
	public void M1() {
		System.out.println("I am from Child");
	}
	public static void main(String[] args) {
		ChildClStatOverriding obj=new ChildClStatOverriding();
		obj.M1();
		StaticMethodOverriding obj1=new StaticMethodOverriding();
		obj1.M1();
		StaticMethodOverriding obj2=new ChildClStatOverriding(); //parent class is referring to child 
		obj2.M1();										 //static method overriding is c/a method hiding
	}
	
}
