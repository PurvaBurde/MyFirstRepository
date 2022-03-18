package Inheriatnce;


 interface sub1 {
	class Add {
		int num1=5,num2=4,result;
		
		public void sum() {
			result=num1+num2;
			System.out.println(result);	
		}
	}
	class addsub {
		int num1=5,num2=4,result;
		public void sub() {
			result=num1-num2;
			System.out.println(result);
		}
	}
}

public class SingallevelInheriatnce {
	 public static void main(String[] args) {
		 multi obj=new multi();
		 
	       obj.multiplication();
	

}

	
}

class multi implements sub1{	
	int num1=5,num2=4,result;
	public void multiplication() {
		result=num1*num2;
	System.out.println(result);
	}
}
		
	
	

	
