public class ReferenceExample {
	static void printCardInfo(StudentCard card) {
		System.out.println("学籍番号：" + card.id);
		System.out.println("氏名：" + card.name);
	}

	static void clearCardInfo(StudentCard card) {
		card.id = 0;
		card.name = "未定";
	}

	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		a.id = 1234;
		a.name = "鈴木太郎";

		printCardInfo(a);
		clearCardInfo(a);
		printCardInfo(a);
	}
}
