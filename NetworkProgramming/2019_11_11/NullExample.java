public class NullExample {
	public static void main(String[] args) {
		StudentCard[] cards = new StudentCard[3];
		cards[1] = new StudentCard();
		cards[1].id = 1235;
		cards[1].name = "佐藤花子";

		for (int i = 0; i < 3; i++) {
			if (cards[i] == null) {
				System.out.println("cards[" + i + "]は参照がありません");
			} else {
				System.out.println("cards[" + i + "]の" + "idは" + cards[i].id + "、nameは" + cards[i].name);
			}
		}
	}
}