package Shapes;

public class ShapeTest {
	public static void drawShape(Drawable d, Shape s) {
		d.draw(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape box = new Rectangle(4,5);
		box.computeArea();
		box.computePerimeter();
		System.out.println(box);
		Shape box1 = new Square(3);
		box1.computeArea();
		box1.computePerimeter();
		System.out.println(box1);
		drawShape(new Drawing(),box);
		drawShape(new Drawing(),box1);
		drawShape(new MyDrawable(),box1); // innerclass call
		
		
		Drawable d = new Drawable() {  //anonymous inner class
			public void draw(Shape s) {
				if( s instanceof Rectangle) {
					System.out.println("I am Drawing a Rectangle");
					for(int i = 0;i<s.width;i++) {
						System.out.print("\t");
						for(int j=0;j<s.length;j++) {
							System.out.print(" * ");
						}
						System.out.println("");
					}
				}
				else if(s instanceof Square) {
					System.out.println("I am drawing a Square");
					for(int i = 0;i<s.length;i++) {
						System.out.print("\t");
						for(int j=0;j<s.length;j++) {
							System.out.print(" * ");
						}
						System.out.println("");
					}

					
				}

		}
		};
		drawShape(d,box);  //anonymous interface/inner class call


	}
	static class  MyDrawable implements Drawable{  //named innerclass and it's declared static for no instantiation
		@Override
			public void draw(Shape s) {
				if( s instanceof Rectangle) {
					System.out.println("I am Drawing a Rectangle");
					for(int i = 0;i<s.width;i++) {
						System.out.print("\t");
						for(int j=0;j<s.length;j++) {
							System.out.print(" * ");
						}
						System.out.println("");
					}
				}
				else if(s instanceof Square) {
					System.out.println("I am drawing a Square");
					for(int i = 0;i<s.length;i++) {
						System.out.print("\t");
						for(int j=0;j<s.length;j++) {
							System.out.print(" * ");
						}
						System.out.println("");
					}

					
				}

		}
	}

}


