package abstractioninterfacespolymorphism;

public class Triangle extends Shape {

	public void calculatePerimeter() {
		System.out.println("Perimeter of triangle");
	}

	@Override
	public void calculateArea() {
		System.out.println("area of triangle");

	}
}
