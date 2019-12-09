
//このテストプログラムが動くように
//CDPlayer.java、VideoPlayer.java、Player.javaを
//作成してください。

class PlayerTest3 {
	public static void main( String[] args ){
    
		
		VideoPlayer vp = new VideoPlayer();	//ビデオプレーヤーのインスタンスvp生成
		PortablePlayer pp = new PortablePlayer();	//ポータブルプレーヤー
		
		vp.play();		//video再生
		vp.slow();		//videoスロー
		vp.stop();		//video停止
		
		pp.play();		//PP再生
		pp.slow();		//PP再生	//エラーならOK、コメントにしてください
		pp.stop();		//PP停止
		
		
		
		
		
  	
  }
}
