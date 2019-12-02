package pkg7syou;

public class VirtualPetGame {

	public static void main(String[] args) {
		VirtualDog taro = new VirtualDog("タロ", 100, 50);
		VirtualBird piyo = new VirtualBird("ピヨ", 60, 30);

		//移動と睡眠を行わせる
		
		//まずは、タロから。
		taro.move();		
		taro.sleep();
		
		//次にピヨ。
		piyo.move();
		piyo.sleep();
		
		
		//このルーティーン（動く→寝る）を登録したい→moveAndSleep()メソッドを作成する
		taro.moveAndSleep();
		piyo.moveAndSleep();
	}
}
