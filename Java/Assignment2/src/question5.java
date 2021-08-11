abstract class shape{
      abstract void draw();
}
class Line extends shape{
	void draw() {
		System.out.println("Line");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("Rectangle");
	}
}
class Cube extends shape{
	void draw() {
		System.out.println("Cube");
	}
}
class Square extends shape{
	void draw() {
		System.out.println("Square");
	}
}
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Line obj=new Line();
         obj.draw();
         Rectangle obj1=new Rectangle();
         obj1.draw();
         Cube obj2=new Cube();
         obj2.draw();
         Square obj3=new Square();
         obj3.draw();
	}

}
