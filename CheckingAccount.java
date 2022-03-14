public class CheckingAccount{
	//create a CheckingAccount class
	//The class has balance and account number fields. 
	private double balance;
	private String accountNo;
	
	public CheckingAccount(String accountNo) {		
		this.accountNo = accountNo;
		this.balance = 0;
	}
	public CheckingAccount(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	//with methods deposit(), withdraw(), getBalance(), getNumber()
	public void deposit(double amount){
		if (amount > 0) {
			this.balance += amount;
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		//It throws a user-defined exception InsufficientFundsException if amount to withdraw is higher than the balance.
		if(amount > this.balance)
		{
			throw new InsufficientFundsException(amount-this.balance);
		}
		else
		{
			this.balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getNumber() {
		return accountNo;
	}	
}
