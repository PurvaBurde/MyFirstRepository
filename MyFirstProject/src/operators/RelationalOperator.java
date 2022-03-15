package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperator obj=new RelationalOperator();
		obj.greaterthan(10, 3);
		obj.lessthan(5, 9);
		obj.equalTo(6,6);
		obj.GrEqTo(6, 6);
		obj.SmEqTo(2, 7);
		obj.NotEqTo(5, 6);

	}
	//for relational operator greater than
	public void greaterthan(int a,int b) {
		System.out.println("a is greater than b? "+ (a>b));
	}
	//for relational operator less than
	public void lessthan(int a,int b) {
		System.out.println("a is less than b? "+ (a<b));
	}
	//for relational operator equal to
	public void equalTo(int a,int b) {
		System.out.println("a is equal to b? "+ (a==b));
	}
	//for relational operator greater than or equal to
	public void GrEqTo(int a,int b) {
		System.out.println("a is greater than or equal to b? "+ (a>=b));
	}
	//for relational operator smaller than or equal to
	public void SmEqTo(int a,int b) {
		System.out.println("a is smaller than or equal to b? "+ (a<=b));
	}
	//for relational operator smaller than or equal to
		public void NotEqTo(int a,int b) {
			System.out.println("a is not equal to b? "+ (a!=b));
		}

}
