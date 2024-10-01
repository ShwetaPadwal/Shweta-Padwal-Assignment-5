/*
Bob has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to 
print the money deposited by him in a particular bank.Create a class 'Bank' with a method 'getBalance' which returns
 0 and another method ‘applyInterest’ which return the accountbalance. Make its three subclasses named 'BankA', 'BankB'
and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank.
Override the method ‘applyInterest’ by adding the interest calculated with the Bank’s interest rate (Static variable for
the Bank class). Call the method 'getBalance' and ‘applyInterest’ by the Object of each of the three banks. 
*/

package Assignment1_10_24;

public class TestBank {

	public static void main(String[] args) {
		
		BankA banka=new BankA(1000);
		System.out.println("BankA balance : "+ banka.getBalance());
		System.out.println("BankA balance after adding interest rate "+ banka.applyInterest());
		System.out.println("========================================");
		
		BankB bankb=new BankB(1500);
		System.out.println("BankB balance : "+ bankb.getBalance());
		System.out.println("BankB balance after adding interest rate "+ bankb.applyInterest());
		System.out.println("========================================");
		
		BankC bankc=new BankC(2000);
		System.out.println("BankC balance : "+ bankc.getBalance());
		System.out.println("BankC balance after adding interest rate "+ bankc.applyInterest());
		System.out.println("========================================");
	}

}
