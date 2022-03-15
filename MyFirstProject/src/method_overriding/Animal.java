package method_overriding;

public class Animal {
	
	public void sound() { //overridden method
		System.out.println("No sound");
	}
	public void sleep() {
		System.out.println("I am from parent class");
	}
	
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.sound();
		Dog obj1=new Dog();
		obj1.sound();
		
	}
}
	
	class Dog extends Animal{ 
		
		public void sound() { //overriding method
			System.out.println("Bark Bark");
		}
	}
	
	class Cat extends Animal{
		
		public void sound() {
			System.out.println("Meow Meow");
		}
	
		
	}
	



