package pkg6syou;

class StudentCard {

	int id; // 学籍番号
	String name; // 氏名

	//コンストラクタ
	StudentCard()
	{
		this(0, "未定義");
		/*
		this.id = 0;
		this.name = "未定義";
		*/
	}//両方の可変変数が存在するコンストラクタの呼び出し


	StudentCard(String name)
	{
		this.name = name;
	}

	StudentCard(int id)
	{
		this.id = id;
		this.name = "未定義";
	}

	StudentCard(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	StudentCard(String name, int id)
	{
		this(id, name);
	}

	//メソッド
	void printInfo()
	{
		System.out.println("学籍番号:" + this.id);
		System.out.println("氏名:" + this.name);
	}
}
