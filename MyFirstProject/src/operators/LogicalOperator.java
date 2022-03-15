package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //.............................And operator.................................
		
		System.out.println("both condition is true so final result is "+(5<6 & 6>3));
		System.out.println("first condition is false so final result is "+(7<6 && 6>3));
		System.out.println("second condition is false so final result is "+(5<6 && 2>3));
		System.out.println("both condition is false so final result is "+(7<6 && 2>3));
		
		
        //.............................Or operator.................................
		
		System.out.println("both condition is true so final result is "+(5<6 || 6>3));
		System.out.println("first condition is false so final result is "+(7<6 || 6>3));
		System.out.println("second condition is false so final result is "+(5<6 || 2>3));
		System.out.println("both condition is false so final result is "+(7<6 || 2>3));
		
		
        //.............................Prefix and Suffix.................................
		
		
	}

}
