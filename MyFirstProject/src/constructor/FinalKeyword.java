package constructor;

public class FinalKeyword {
	
	public final float pi=3.14f;
	
	FinalKeyword(){
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyword obj=new FinalKeyword();
		//obj.pi=45;     // since the final keyword is used the value of pi is constant or non changeable
		System.out.println(obj.pi);
	}

}
