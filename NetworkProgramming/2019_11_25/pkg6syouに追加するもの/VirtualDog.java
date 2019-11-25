package pkg6syou;

class VirtualDog {
	String name; // 名前
	int maxEnergy; // 最大体力
	int energy; // 現在の体力

	VirtualDog(String name, int maxEnergy, int energy) {
		this.name = name;
		this.maxEnergy = maxEnergy;
		this.energy = energy;
	}

	void sleep() {
		System.out.println(this.name + "：よく寝た。体力が回復したよ。");
		this.energy = this.maxEnergy; // 現在の体力の値を最大体力の値にする
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
