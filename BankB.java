package Assignment1_10_24;

public class BankB extends Bank{
	
	private double deposit;
	
	 public BankB(double deposit) {
	        this.deposit = deposit;
	    }

	@Override
	public double getBalance() {
		return deposit;
	}

}
