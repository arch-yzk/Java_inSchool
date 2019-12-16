package pkg1syou;

class SimpleClass {
	String str;
	SimpleClass(String str) {
		this.str = str;
	}
}

public class MultiClassExample {
	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass("Hello.");
		System.out.println(sc.str);
	}
}
