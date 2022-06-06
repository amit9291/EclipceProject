
interface Drawable{
	void draw();
	}
class Rectangle implements Drawable{
	public void draw() {System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
	public void draw() {System.out.println("drawing circle");}
}
public class random {

	public static void main(String[] args) {
		
Drawable d = new Rectangle();
Drawable b = new Circle();
b.draw();
d.draw();
	}

}
