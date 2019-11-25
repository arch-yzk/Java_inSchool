package pkg7syou;
public class StudentCard {
	int id; // 学籍番号
	String name; // 氏名
	//String nationality;
	//↑既存コードが機能しなくなるのでNG

	void printInfo() {
		System.out.println("学籍番号：" + this.id);
		System.out.println("氏名：" + this.name);
	}
}
