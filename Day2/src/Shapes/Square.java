package Shapes;

public class Square extends Shape {
	public Square(double l) {
		super(l);
	}

	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.println("The Area of Square: " + length*length);
	}

	@Override
	public void computePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of Square: " + 4*length);
	}
	@Override
	public String toString() {
		return "This is a Square";
	}

}
