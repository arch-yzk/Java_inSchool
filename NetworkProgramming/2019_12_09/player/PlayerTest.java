
//このテストプログラムが動くように
//CDPlayer.java、VideoPlayer.java、Player.javaを
//作成してください。


class PlayerTest {
	public static void main( String[] args ){
    
  		CDPlayer cp = new CDPlayer();		//CDプレーヤーのインスタンスcp生成
		VideoPlayer vp = new VideoPlayer();	//ビデオプレーヤーのインスタンスvp生成
		VideoPlayer vp2 = new VideoPlayer();
		cp.play();		//CD再生
		vp.play();		//Video再生
		
		cp.stop();		//CD停止
		vp.stop();		//Video停止
		
		cp.cleanUp();	//CDクリーニング
		vp.printInfo();	//Video製造番号の表示
		vp2.printInfo();	//２台目の表示（idが２）
  }
}
