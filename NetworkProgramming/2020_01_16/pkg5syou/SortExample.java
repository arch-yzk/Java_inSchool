package pkg5syou;import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(Point p) {
		return (this.x + this.y) - (p.x + p.y);
	}
}

public class SortExample {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));

		Collections.sort(pointList);

		for (Point p : pointList) {
			System.out.println("(" + p.x + "," + p.y + ")->" + (p.x + p.y));
		}
	}
}