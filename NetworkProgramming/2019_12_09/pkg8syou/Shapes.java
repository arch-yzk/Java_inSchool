package pkg8syou;

class Shape {
	void draw() { //あえて何も書かない
		
	}
}

class Polyline extends Shape {
	// 折れ線を描画する
	void draw() {
		System.out.println("Ｎ");
	}
}

class Rectangle extends Shape {
	// 長方形を描画する
	void draw() {
		System.out.println("□");
	}
}

class Circle extends Shape {
	// 円を描画する
	void draw() {
		System.out.println("○");
	}
}