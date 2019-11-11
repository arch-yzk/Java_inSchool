public class InstanceExample2 {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		StudentCard b = new StudentCard();
		StudentCard c = b;
		a.id = 1234;
		a.name = "鈴木太郎";
		b.id = 1235;
		b.name = "佐藤花子";

		System.out.println("aのidは" + a.id + ",nameは" + a.name);
		System.out.println("bのidは" + b.id + ",nameは" + b.name);
		System.out.println("cのidは" + c.id + ",nameは" + c.name);
		System.out.println("================================");

		c.id = 1236;
		c.name = "山田二郎";

		System.out.println("aのidは" + a.id + ",nameは" + a.name);
		System.out.println("bのidは" + b.id + ",nameは" + b.name);
		System.out.println("cのidは" + c.id + ",nameは" + c.name);
	}
}
