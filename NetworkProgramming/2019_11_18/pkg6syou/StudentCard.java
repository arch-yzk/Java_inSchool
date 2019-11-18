package pkg6syou;

class StudentCard {

	int id; // 学籍番号
	String name; // 氏名

	//コンストラクタ
	StudentCard()
	{
		this.id = 0;
		this.name = "未定義";
	}

	StudentCard(String name)
	{
		this.name = name;
	}

	StudentCard(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
