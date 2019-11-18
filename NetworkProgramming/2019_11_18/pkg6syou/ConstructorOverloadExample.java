package pkg6syou;


public class ConstructorOverloadExample {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		System.out.println("aのidの値は" + a.id);
		System.out.println("aのnameの値は" + a.name);

		StudentCard b = new StudentCard("鈴木太郎");
		System.out.println("bのidの値は" + b.id);
		System.out.println("bのnameの値は" + b.name);

		StudentCard c = new StudentCard(1235, "佐藤花子");
		System.out.println("cのidの値は" + c.id);
		System.out.println("cのnameの値は" + c.name);
	}
}
