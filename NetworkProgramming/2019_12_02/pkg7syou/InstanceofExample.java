package pkg7syou;
class Person {
	// Person(�l)�N���X�̓��e
	void work()
	{
		System.out.println("�l�Ԃł�");
	}
}

class Student extends Person {
	// Student(�w��)�N���X�̓��e
	void work()
	{
		System.out.println("�w���ł�");
	}
}

class Teacher extends Person {
	// Teacher(����)�N���X�̓��e
	void work()
	{
		System.out.println("�����ł�");
	}

	void makeTest()
	{
		System.out.println("�e�X�g���܂�");
	}
}

public class InstanceofExample {
	public static void main(final String[] args) {
		final Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();

		for (final Person p : persons) // ���[�v����p�ŎQ��
		{
			p.work();

			if(p instanceof Teacher)
			{
				((Teacher)p).nameTest(); //persons�z��ł͂Ȃ�p�Ɋ|������
			}
		}

		/*for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Person) {
				System.out.println("persons[" + i + "]��Person�N���X�̃C���X�^���X�ł�");
			}
			if (persons[i] instanceof Student) {
				System.out.println("persons[" + i + "]��Student�N���X�̃C���X�^���X�ł�");
			}
			if (persons[i] instanceof Teacher) {
				System.out.println("persons[" + i + "]��Teacher�N���X�̃C���X�^���X�ł�");
			}
		}*/
	}
}
