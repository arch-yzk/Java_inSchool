package pkg2syou;

//Silver7_11　例外の問題、ちょい難しい！
//このエラーをとるにはどうする？

public class Silver7_11 {

	public static void main(String[] args)  {
		P p = new C();
	
		p.strToNum("a");
			
}
class P{
	public void strToNum(String s) throws NumberFormatException{
		System.out.println("P:" + Integer.parseInt(s));
	}
}
class C extends P{
	public void strToNum(String s) throws Exception{
		System.out.println("C:" + Integer.parseInt(s));
	}
}
