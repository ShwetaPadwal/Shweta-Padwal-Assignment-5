package Assignment1_10_24;

public class BankA extends Bank {

	private double deposit;
	
	 public BankA(double deposit) {
	        this.deposit = deposit;
	    }
	 
	@Override
	public double getBalance() {
		return deposit;
	}

}
