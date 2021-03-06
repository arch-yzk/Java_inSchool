
class StringMethod {

	public static void main(String[] args) {
			
		String str = "ABCDEFG";

		//変数strについて、以下を調べる。
		System.out.printf("チェックする文字列は\"%s\"です\n",str);

		//文字列の長さを取得する
		System.out.println("長さは" + str.length() + "です");
		
		//２番目の文字を取り出す
		System.out.println("２番目の文字は" + str.charAt(2));
		
		//Dの文字は何番目に出現するか
		System.out.println("Dは" + ((str.indexOf('D')) + 1) + "番目に出現");


		//指定位置からの文字列取得
		System.out.println("３文字目からの文字列→" + str.substring(2));
		
		
		//指定位置から指定位置までの文字列取得
		System.out.println("１～３文字目の文字列→" + str.subSequence(0, 3));
		

		//大文字、小文字変換
		System.out.println("変数strを小文字にすると→" + str.toLowerCase());
		
		
		
	}

}
