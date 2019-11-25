package pkg7syou;

class A{
	
	A(){
		System.out.println("A:引数なしコンストラクタ");
	}
	A(int x){
		System.out.println("A:引数１つのコンストラクタ");
	}
	
}
class B extends A{
	
	
}
public class ConstExample {
	public static void main(String[] args) {
		
		B b = new B();
		
		
	}
}
