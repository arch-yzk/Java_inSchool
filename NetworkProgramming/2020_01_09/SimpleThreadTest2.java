class MyThread2  implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("MyThreadのrunメソッド(" + i + ")");
		}
	}
}

public class SimpleThreadTest2 {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		Thread thread = new Thread(t);
		thread.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("SimpleThreadTest2のmainメソッド(" + i + ")");
		}
	}
}
