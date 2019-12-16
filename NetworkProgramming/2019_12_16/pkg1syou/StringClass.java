package pkg1syou;

public class StringClass {

	public static void main(String[] args) {
		
		String str = "Javaの学習";
		System.out.println(str.length()); // 7
		System.out.println(str.indexOf("学習")); // 5

		String str2 = str.replace("Java", "Java言語");
		System.out.println(str2); // Java言語の学習

	}

}
