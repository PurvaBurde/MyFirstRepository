package operators;

public class nested_if {
	
	//For blood donation :- Age>=18 and Weight>50

	public static void main(String[] args) {
		
		int age =18;
		int weight =52;
		
		if(age>=18) {
			
			if(weight>50) {
				System.out.println("You can donate the blood ");
			} else {
				System.out.println("I am under weight ");
			}
		}else {
			System.out.println("Your age is under 18 ");
		}

	}

}
