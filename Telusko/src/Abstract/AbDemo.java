package Abstract;

public class AbDemo {

	public static void main(String[] args) {
		Maheshphone obj =new  Sureshphone();//cannot instantiate the Abstract class
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	
		
	}
}

	abstract class Maheshphone{
		public void call() {
	System.out.println("calling...");
		}
		public abstract void move();     // Abstract method
		public abstract void dance();
		public abstract void cook();
}
	abstract class Rameshphone extends Maheshphone{
		public void  move () {
			System.out.println("moving...");
		}
	}
	
	class Sureshphone extends Rameshphone{
		public void dance() {
			System.out.println("dancing...");
		}
		public  void cook() {
			System.out.println("cooking...");

		}
		
	}