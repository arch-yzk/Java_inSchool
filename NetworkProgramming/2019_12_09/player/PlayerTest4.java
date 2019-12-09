
//各プレーヤーを配列でまとめて操作してみよう

class PlayerTest4 {
	public static void main( String[] args ){
  	
		//配列で扱う
		Player[] p = new Player[3];
		p[0] = new VideoPlayer();
		p[1] = new CDPlayer();
		p[2] = new PortablePlayer();

		//このように書いてもよし
		//Player[] p = {new VideoPlayer(),new CDPlayer(), new PortablePlayer()};//上と同じ

		for(Player a : p) {
			
			a.play();		//みんな、再生ーーー！
			a.stop();		//みんな、ストップー！
			//a.slow();
			//スローはどう呼ぶ？
			//if(a instanceof ??? )	((???)a).slow();
			
		}
	}
}
