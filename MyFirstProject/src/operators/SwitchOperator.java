package operators;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var=4;
		
		/*if(var==1) {
			System.out.println("Jan ");
		}else if(var==2) {
			System.out.println("Feb ");
		}else if(var==3) {
			System.out.println("Mar "); 
		}else {
			System.out.println("Please put the value between 1 to 12 ");
		}*/
		
		switch(var) {
		
		case 1: 
			System.out.println("January ");
			break;
		case 2: 
			System.out.println("February ");
			break;
		case 3: 
			System.out.println("March ");
			break;
		case 4: 
			System.out.println("April ");
			break;
		case 5:
			System.out.println("May ");
			break;
		case 6: 
			System.out.println("June ");
			break;
		case 7: 
			System.out.println("July ");
			break;
		case 8: 
			System.out.println("August ");
			break;
		case 9:
			System.out.println("September ");
			break;
		case 10: 
			System.out.println("October ");
			break;
		case 11:
			System.out.println("November ");
			break;
		case 12: 
			System.out.println("December ");
			break;
		default:
			System.out.println("Please put the value between 1 to 12 ");
			
		}
	}

}
