package pkg6syou;

import java.util.Scanner;

/*
 * メニューを増やしてください
 * （必須）走る→体力が20減る、最大体力は2増える(void run())
 * 　　　　エサを食べる→「もぐもぐ」して、体力を20増やしてください(void eat())
 * 　　　　吠える→「わんわん！」と吠えて、体力は5減る(void bark(int count))
 * （任意）
 * 　　　　何か芸をしこんでください。
 */


public class VirtualPetGameMenu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ワンちゃんの名前は何にしますか？→");
		String name = sc.next();
		
		System.out.print("ワンちゃんの体力は何にしますか？→");
		int energy = sc.nextInt();
		
		//わんこインスタンス生成
		VirtualDog wan = new VirtualDog(name, energy+10, energy );
		
		
		for(;;){
			if(wan.energy == 0)
			{
				System.out.println("終了します");
				break;
			}
			else
			{
				if(wan.energy == 0)
				{
					System.out.println("終了します");
					break;
				}
				System.out.print("\n■何をさせますか？\n1:状態表示  2:歩く  3:眠る  4:走る  5:吠える  6:エサを食べる  9:やめる→");
			
				int no = sc.nextInt();
			
				switch(no){
					case 1:
						wan.printInfo();
						break;
					case 2:
						wan.walk();
						break;
					case 3:
						wan.sleep();
						break;
					case 4:
						wan.run();
						break;
					case 5:
						System.out.print("何回？→");		
						int count = sc.nextInt();
						wan.bark(count);
						break;
					case 6:
						wan.eat();
						break;
				}
				if(no == 9)
				{
					break;
				}
			}
		}
	}
}
