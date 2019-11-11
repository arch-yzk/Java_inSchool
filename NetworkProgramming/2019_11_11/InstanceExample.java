public class InstanceExample {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		a.id = 1234;
		a.name = "鈴木太郎";

		StudentCard b = new StudentCard();
		b.id = 1235;
		b.name = "佐藤花子";

		System.out.println("aのidの値は" + a.id);
		System.out.println("aのnameの値は" + a.name);
		System.out.println("bのidの値は" + b.id);
		System.out.println("bのnameの値は" + b.name);
	}
}