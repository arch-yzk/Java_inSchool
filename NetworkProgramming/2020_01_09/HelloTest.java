//HelloTest.java

/*
	Japan、Americaクラスともに並列処理に対応させる
	
	→
	①Threadクラスを継承する
	②public void run()メソッドを実装する
	③呼び出し側でstart()することにより、run()が実行される
	④みんな挨拶がおわったら報告する
*/

class Japan extends Thread{
	//public void hello(){
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class America implements Runnable{
	//public void hello(){
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("ＨＥＬＬＯ");
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class HelloTest{
	public static void main (String[] args ){
	
		Japan hanako = new Japan();
		
		America tom = new America();
		Thread tomRunnable = new Thread(tom);
		
		//hanako.hello();
		hanako.start();
		try{
			hanako.join();
		} catch(InterruptedException e){
			System.out.println(e);
		}
		
		//tom.hello();
		//tom.start();
		tomRunnable.start();
		try{
			//tom.join();
			tomRunnable.join();
		} catch(InterruptedException e){
			System.out.println(e);
		}

		System.out.println("終了");
	}
}