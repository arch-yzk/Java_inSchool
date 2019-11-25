package pkg6syou;

//かわいいワンちゃんを動かしてあそぼう！
//①タロとジロに、いろいろ命令しましょう。
//②体力、最大体力の変化を確認しよう
//③ワンちゃんが登場した瞬間に「ぼく、●●だよ、よろしくね！」と表示しよう
//	→どこにかく？
//④飼い主はあなたです。何匹ワンちゃんが登場しようと、全部あなたが飼い主です。
//   String master;　※ご主人の名前
//→masterフィールドをDogクラスに作ってください。

public class VirtualPetGame {
	public static void main(String[] args) {
		VirtualDog taro = new VirtualDog("タロ", 100, 50);
		VirtualDog jiro = new VirtualDog("ジロ", 80, 40);

		// バーチャルドッグのインスタンスに、歩いたり寝たりさせてみる
		taro.walk();
		

		// それぞれのインスタンスの情報を出力する
		taro.printInfo();
		jiro.printInfo();

		//歩かせる
		jiro.walk();
		jiro.printInfo();

		VirtualDog.master = "Yuzuki";

		VirtualDog saburo = new VirtualDog("サブロー", 60, 30);

		saburo.printInfo();
	}
}
