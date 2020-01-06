package pkg2syou;

//Silver7_11　例外の問題

public class Silver7_1 {

	public static void main(String[] args) {
		
			String string = "123.45";
			
			try {
				int i = Integer.parseInt(string);
				System.out.println("in try:" +  i);
			}catch(Exception e) {
				System.out.println("in catch" + i) ;
			}finally {
				System.out.println("in fainally");
			}
	}

}
