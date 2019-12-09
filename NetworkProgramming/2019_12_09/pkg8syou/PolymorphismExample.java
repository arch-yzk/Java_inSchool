package pkg8syou;


public class PolymorphismExample {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Polyline();
		shapes[1] = new Rectangle();
		shapes[2] = new Circle();

		for (int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
	}
}