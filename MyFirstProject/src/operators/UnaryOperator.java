package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator obj=new UnaryOperator();
		obj.Positive(-5);
		obj.Negative(5);
		obj.Increment(25);
		obj.Decrement(40);
		obj.Boolean(true);

	}
	private void Positive(int a) {  //it is use to represent positive value
		System.out.println("I am operator to represent positive "+ (+a));
	}
	
	private void Negative(int b) {  //it is use to represent negative value
		System.out.println("I am operator to represent negative "+ (-b));
	}
	
	private void Increment(int c) {  //c=c+1  i.e. it will increment by 1
		System.out.println("I am operator to represent increment "+ (++c));
	}
	
	private void Decrement(int d) {  //d=d+1  i.e. it will decrement by 1
		System.out.println("I am operator to represent decrement "+ (--d));
	}
	
	private void Boolean(boolean e) {  //it is use to invert the value of only boolean data type
		System.out.println("I am operator to represent boolean "+ (!e));
	}

}
