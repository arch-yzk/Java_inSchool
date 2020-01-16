package pkg5syou;

import java.util.ArrayList;
import java.util.Collections;


public class BookTest {

	public static void main(String[] args) {
		
		ArrayList<Book> ar= new ArrayList<>();
		
		ar.add(new Book("ハイキュー",600));
		ar.add(new Book("ももたろう",450));
		ar.add(new Book("ドラえもん",350));
		ar.add(new Book("あたしンち",600));
		ar.add(new Book("ジャイキリ",550));
		
		System.out.println("----sort前-----");
		for(Book a:ar) 
			System.out.printf("%s\t:%d\n",a.title,a.price);
		
		Collections.sort(ar); 
		
		System.out.println("\n----sort後-----");
		for(Book a:ar) 
			System.out.printf("%s\t:%d\n",a.title,a.price);
		
	}
}
