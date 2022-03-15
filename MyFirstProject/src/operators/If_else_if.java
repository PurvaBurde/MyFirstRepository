package operators;

public class If_else_if {

	public static void main(String[] args) {
		
		int abc=20;
		//Print the message as I am less than 10
		//Print the message as I am greater than 10 but less than 20
		//Print the message as I am greater than 20
		
		if(abc<=10) { /* we have to use '>=' not only '>' 
			             otherwise it will be a logical error/defect as we did not considered the =10 condition*/
			System.out.println("I am equal to or less than 10 ");
		} else if(abc>10 && abc<=20) {  
			System.out.println("I am greater than 10 but less than or equal to 20 ");
		} else {
			System.out.println("I am greater than 20 ");
		}

	}

}
