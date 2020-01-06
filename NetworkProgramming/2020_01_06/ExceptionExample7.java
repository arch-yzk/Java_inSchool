class Person {
	int age;

	void setAge(int age) throws InvalidAgeException {
		if (age < 0) {
			throw new InvalidAgeException("年齢にマイナスの値が指定されました");
		}
		this.age = age;
	}
}

public class ExceptionExample7 {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(-5);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}
}
