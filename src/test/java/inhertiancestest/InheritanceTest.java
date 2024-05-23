package inhertiancestest;

public class InheritanceTest {

	public static void main(String[] args) {
		StateBankOfIndia stateBankOfIndia = new StateBankOfIndia();
		stateBankOfIndia.provideLoan();
		System.out
				.println("State of Bank of India offer loan with rate of interest " + stateBankOfIndia.rateOfInterest);

		Bank bank = new Bank();

		bank.provideLoan();

	}

}
