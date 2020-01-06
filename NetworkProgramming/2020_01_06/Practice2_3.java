public class Practice2_3 {
	public static void main(String[] args) {
		try {
			// 何かの処理
			System.out.println("処理が正常に行われました");
		
		} catch (Exception e) {
			System.out.println("例外処理B");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("例外処理A");
		}
		System.out.println("プログラムを終了します");
	}
}