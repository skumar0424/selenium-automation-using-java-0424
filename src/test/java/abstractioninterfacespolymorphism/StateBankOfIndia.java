package abstractioninterfacespolymorphism;

public class StateBankOfIndia extends RBI {
	/* StateBankOfIndia -- Complete class / concrete class */
	@Override
	public void provideLoan() {
		System.out.println("SBI provides personal loans");
	}

	@Override
	public void provideCreditCard() {
		System.out.println("SBI provides credit card");
	}

}
