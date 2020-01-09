class MyThread3 extends Thread {
	public boolean running = true;
	public void run() {
		while(running) {
			try{sleep(100);}catch(Exception e) {}
			System.out.print("*");
		}
		System.out.println("runメソッドを終了します");
	}
}

public class ThreadStopExample {
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();

		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}

		t.running = false;
	}
}
