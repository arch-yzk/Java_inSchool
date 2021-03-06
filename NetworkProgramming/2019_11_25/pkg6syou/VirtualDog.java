package pkg6syou;

import java.util.Scanner;

class VirtualDog {
	String name; // 名前
	int maxEnergy; // 最大体力
	int energy; // 現在の体力
	static String master = "master";

	VirtualDog(String name, int maxEnergy, int energy) {
		this.name = name;
		this.maxEnergy = maxEnergy;
		this.energy = energy;
		System.out.println("僕、"+ this.name + "だよ！よろしくね！");
		System.out.println("飼い主さんは" + master + "だよ！");
	}

	void sleep() {
		System.out.println(this.name + "：よく寝た。体力が回復したよ。");
		this.energy = this.maxEnergy; // 現在の体力の値を最大体力の値にする
	}

	void run()
	{
		Scanner sc = new Scanner(System.in);
		if(energy <= 20)
		{
			System.out.println("master: 疲れが溜まっているようだ...");
			System.out.print("続行させますか？ はい:1  いいえ:2");
			int a = sc.nextInt();
			if(a == 1)
			{
				System.out.println("命令通り走り続けた");
				System.out.println("死んでしまった...");
				this.energy = 0;
			}
			else
			{
				System.out.println("やめてあげた。");
			}
		}
		else
		{
			System.out.println("走った。");
			this.energy -= 20;
			this.maxEnergy += 2;
		}
	}

	void eat()
	{
		if(energy + 20 >= maxEnergy)
		{
			System.out.println("一部残しつつ食べた。");
			this.energy = maxEnergy;
		}
		else
		{
		System.out.println("食った。");
		this.energy += 20;
		}
	}
	
	void bark(int count)
	{
		for(int i = 0; i < count; i++)
		{
			if(energy <= 5)
			{
				if(i != 0)
				{
					System.out.println();
				}
				System.out.println("master: もう鳴くのはきつそうだ。");
				break;
			}
			System.out.print("ワン");
			this.energy -= 5;
		}
		System.out.println();
	}

	void walk() {
		if (this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(this.name + "：トコトコ、、、歩いたよ。体力が10減った。最大体力が1増えた。");
			this.energy -= 10; // 体力が10減る
			this.maxEnergy++; // 最大体力が1増える
		}
	}
	

	void printInfo() {
		System.out.println("[状態出力]");
		System.out.println("名前：" + this.name);
		System.out.println("最大体力：" + this.maxEnergy);
		System.out.println("体力：" + this.energy);
	}
}
