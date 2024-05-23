package inhertiancestest;

public class StateBankOfIndia extends Bank {
	int loanAccountNumber;

	public void provideLoan() {
		System.out.println("SBI Bank provides loan with Rate of Interest " + rateOfInterest + " " + loanAccountNumber);
	}
}
