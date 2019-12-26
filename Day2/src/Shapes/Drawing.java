package Shapes;

public class Drawing implements Drawable {
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
