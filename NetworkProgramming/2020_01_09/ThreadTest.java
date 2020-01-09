class SimpleThread implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new Thread(new SimpleThread());
		t.start();
	}
}