package Assignment1_10_24;

public class Bank {

	static double interestrate= 0.025;
	
	public double getBalance() {
	return 0;
	}
	
	public double applyInterest()
	{
		double balance=getBalance();
		balance= balance+balance*interestrate;
		return balance;
		
	}
}
