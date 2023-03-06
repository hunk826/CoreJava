package CoreJava;

public class BalanceTest {

	public static void main(String[] args) 
	{
		BankAccount bk=new BankAccount(1000,"123456");
		
		System.out.println("Balance :"+bk.getBalance()+"\n"+"Account Number :"+bk.getAccountNumber());
		bk.deposit(500);
		bk.withdraw(200);
		
		System.out.println("Balance after deposit and withdrawal :"+bk.getBalance());

	}

}
