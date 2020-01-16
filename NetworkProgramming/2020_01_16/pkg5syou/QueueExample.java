package pkg5syou;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.offer("(1)");
		System.out.println("キューの状態:" + queue);
		queue.offer("(2)");
		System.out.println("キューの状態:" + queue);
		queue.offer("(3)");
		System.out.println("キューの状態:" + queue);
		queue.offer("(4)");
		System.out.println("キューの状態:" + queue);

		while (!queue.isEmpty()) {
			System.out.println("要素の取り出し:" + queue.poll());
			System.out.println("キューの状態" + queue);
		}
	}
}
