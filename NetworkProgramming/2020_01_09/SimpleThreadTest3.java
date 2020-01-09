public class SimpleThreadTest3 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("SimpleThreadTest3クラスのmainメソッド (" + i + ")");
		}
	}
}
