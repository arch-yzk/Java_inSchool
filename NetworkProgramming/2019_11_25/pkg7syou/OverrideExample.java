package pkg7syou;
public class OverrideExample {
	public static void main(String[] args) {
		StudentCard a = new StudentCard();
		a.id = 1234;
		a.name = "鈴木太郎";
		a.printInfo();

		IStudentCard b = new IStudentCard();
		/*
		b.id = 2345;
		b.name = "John Smith";
		b.nationality = "イギリス";
		b.printInfo();
	*/
	}
}
