package pkg7syou;
class Person {
	// Person(人)クラスの内容
}

class Student extends Person {
	// Student(学生)クラスの内容
}

class Teacher extends Person {
	// Teacher(教員)クラスの内容
}

public class InstanceofExample {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Person) {
				System.out.println("persons[" + i + "]はPersonクラスのインスタンスです");
			}
			if (persons[i] instanceof Student) {
				System.out.println("persons[" + i + "]はStudentクラスのインスタンスです");
			}
			if (persons[i] instanceof Teacher) {
				System.out.println("persons[" + i + "]はTeacherクラスのインスタンスです");
			}
		}
	}

}
