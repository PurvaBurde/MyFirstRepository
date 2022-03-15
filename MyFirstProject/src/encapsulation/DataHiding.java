package encapsulation;

public class DataHiding {

	//you are not allowing your data member to be access directly within a class
	private int balance=500;
	private int deposit;
	private int LoanEligibility;
	
	//To access private data member we will have public method
	public int getbalance(int AccountNumber) {
		if(AccountNumber==123) {
		return this.balance;
		}else {
			return 0;
		}
	}
	public int getdeposite() {
		return this.deposit;
	}
	public int getLoanEligibility() {  //get keyword
		return LoanEligibility;  //if you don t add compiler will automatically add
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	
}
