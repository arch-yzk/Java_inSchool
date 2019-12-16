//文字列の比較
//「＝」と「equalsメソッド」の違い、同じ文字列のメモリ扱い

class StringCompare{

	public  static void main( String[] args ){
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "xyz";
		
		String str4 = new String("abc");
		
		if(str1 == str2)	
			System.out.println("str1 と str2 同じです");
		else
			System.out.println("str1 と str2 同じではないです");

		if(str1 == str3)	
			System.out.println("str1 と str3 同じです");
		else
			System.out.println("str1 と str3 同じではないです");
	
		if(str1 == str4)	
			System.out.println("str1 と str4 同じです");
		else
			System.out.println("str1 と str4 同じではないです");
	
		if(str1.equals(str4))	System.out.println("(equals)str1 と str4 同じです");
		else		System.out.println("(equals)str1 と str4 同じではないです");
	}

}