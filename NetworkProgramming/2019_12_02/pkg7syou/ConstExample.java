package pkg7syou;

class A{
	
	A(){
		System.out.println("A:�����Ȃ��R���X�g���N�^");
	}
	A(int x){
		System.out.println("A:�����P�̃R���X�g���N�^");
	}
	
}
class B extends A{
	//�R���X�g���N�^�ȗ�
	B()
	{
		//super();
		System.out.println("B:�����Ȃ��̃R���X�g���N�^");
	}
	B(int num)
	{
		//A(int x)�̃R���X�g���N�^	
		System.out.println("B:����1�̃R���X�g���N�^");
	}
	
}
public class ConstExample {
	public static void main(String[] args) {
		
		//B�C���X�^���X����
		B b = new B();
		B b2 = new B(5);
		
	}
}
