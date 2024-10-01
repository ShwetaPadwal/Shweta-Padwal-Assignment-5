package Assignment1_10_24;

public class BankC extends Bank {


	private double deposit;
	
	 public BankC(double deposit) {
	        this.deposit = deposit;
	    }

	@Override
	public double getBalance() {
		return deposit;
	}
}
