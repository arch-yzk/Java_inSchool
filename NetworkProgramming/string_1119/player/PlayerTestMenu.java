import java.util.*;

//メニューから選んで、プレーヤーを操作しよう
class PlayerTestMenu {
	public static void main( String[] args ){
		
		//配列扱う
		Player[] p = new Player[3];
		p[0] = new VideoPlayer();
		p[1] = new CDPlayer();
		p[2] = new PortablePlayer();

		//Player[] p = {new VideoPlayer(),new CDPlayer(), new PortablePlayer()};//上と同じ

		Scanner sc= new Scanner(System.in);
		
		for(;;){
			int no;
			do{
				System.out.print("\n1:ビデオ  2:CD  3:ポータブル  9:やめる→");
				no = sc.nextInt();
			}while((no != 9) && (no < 1  ||  no > 3) );
			
			if(no == 9) break;
			else{
				for(;;){				
					int no2;
					do{
						System.out.print("1:再生 2:停止 3:スロー (9:戻る）→");
						no2 = sc.nextInt();
					}while( no2 != 1 && no2 != 2 && no2 != 3 && no2 != 9 );
					
					if(no2 == 1){
						p[no-1].play();
					}
					else if(no2 == 2)
					{
						p[no-1].stop();
					}
					else if(no2 == 3)
					{
						if(no == 1)
						{
							((VideoPlayer)p[no-1]).slow();
						}
						else
						{
							System.out.println("対応していません");
						}
					}
					
					
					else break;
					
				}
				
			}
		}

		sc.close();
	}
}
