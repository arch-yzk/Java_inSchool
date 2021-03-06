package pkg7syou;


class VirtualDog extends VirtualPet {
	VirtualDog(String name, int maxEnergy, int energy) {
		super(name, maxEnergy, energy);
	}

	void move() {
		if (this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以上歩けないよ。");
		} else {
			System.out.println(this.name + "：歩いたよ。体力が10減った。最大体力が1増えた。");
			this.energy -= 10; // 体力が10減る
			this.maxEnergy++; // 最大体力が1増える
		}
	}

	void moveAndSleep()
	{
		this.move();
		this.sleep();
	}
}