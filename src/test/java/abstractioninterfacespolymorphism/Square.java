package abstractioninterfacespolymorphism;

public class Square extends Shape {
	public void calculatePerimeter() {
		System.out.println("Perimeter of square");
	}

	@Override
	public void calculateArea() {
		System.out.println("area of square");
	}
}
