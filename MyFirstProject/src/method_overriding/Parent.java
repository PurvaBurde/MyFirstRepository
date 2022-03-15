package method_overriding;

public class Parent {
	
	public void Bike() {
		System.out.println("I am parent class bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.Bike();
		Parent obj1=new Parent();
		obj1.Bike();
		Parent obj2=new Child();
		obj2.Bike();	
	}
}	
	class Child extends Parent{
		public void Bike() {
			System.out.println("I am child class bike");
		}
	}
