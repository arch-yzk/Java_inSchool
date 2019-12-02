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
	//コンストラクタ省略
	B()
	{
		//super();
		System.out.println("B:引数なしのコンストラクタ");
	}
	B(int num)
	{
		//A(int x)のコンストラクタ	
		System.out.println("B:引数1つのコンストラクタ");
	}
	
}
public class ConstExample {
	public static void main(String[] args) {
		
		//Bインスタンス生成
		B b = new B();
		B b2 = new B(5);
		
	}
}
