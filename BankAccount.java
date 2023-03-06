package CoreJava;

class BankAccount 
{
	private double balance;
	private String accountNumber;
	//constructor
	public BankAccount(double balance, String accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	
	
}
