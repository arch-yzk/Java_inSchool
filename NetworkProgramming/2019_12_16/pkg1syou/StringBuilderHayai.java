package pkg1syou;

public class StringBuilderHayai {

	public static void main(String[] args) {
		
		
			// StringBuilderを使って連結（マルチスレッド非対応）
			long t1 = System.currentTimeMillis();
			System.out.println("100000回、append");
			StringBuilder sb = new  StringBuilder();
			for(int i = 0; i < 100000; i++) {
				sb.append("Hello");
			}
			
			
			long t2 = System.currentTimeMillis();
			System.out.println("t2-t1:" + (t2 - t1));
			
			// Stringの「＋」を使って連結		→遅い
			t1 = System.currentTimeMillis();
			System.out.println("100000回、＋");
			String str="";
			for(int i = 0; i < 100000; i++) {
				str+="Hello";
			}
			t2 = System.currentTimeMillis();
			System.out.println("t2-t1:" + (t2 - t1));
						
	}

}
