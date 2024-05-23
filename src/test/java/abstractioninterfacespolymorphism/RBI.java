package abstractioninterfacespolymorphism;

public abstract class RBI {
	// abstractions & interfaces make rules for the children classes
	public abstract void provideLoan();// method signature with return type & input arguements

	public void provideHomeLoan() {
		System.out.println("Provide home loan");
	}

	public abstract void provideCreditCard();
}
