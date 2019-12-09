
//このテストプログラムが動くように
//PortablePlayer.java、Coloring.javaを
//作成してください。

class PlayerTest2 {
	public static void main( String[] args ){
    
		PortablePlayer pp = new PortablePlayer();	//ポータブルプレーヤー
		
		
		pp.play();		//PP再生
		pp.stop();		//PP停止
		
		pp.changeColor(Coloring.RED);		//色を替える
		
		
		
  	
  }
}
