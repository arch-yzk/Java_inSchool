package pkg6syou;

public class InstanceMethodExample {
	public static void main(String[] args) {
		StudentCard a = new StudentCard(1234, "鈴木太郎");
		StudentCard b = new StudentCard(1235, "佐藤花子");
		a.printInfo();
		b.printInfo();
	}
}
