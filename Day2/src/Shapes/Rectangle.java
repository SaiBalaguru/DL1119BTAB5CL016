package Shapes;

public class Rectangle extends Shape {
	
	public Rectangle(double l, double w) {
		super(l,w);
	}
	
	@Override
	public void computeArea() {
		// TODO Auto-generated method stub
		System.out.println("Area = "+ length*width);
	}

	@Override
	public void computePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter = "+ 2*(length+width));

	}
	@Override
	public String toString()
	{
		return "This is a Rectangle";
	}

}
