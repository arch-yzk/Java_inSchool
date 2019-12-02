package pkg7syou;


class VirtualBird extends VirtualPet {
    VirtualBird(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    void move() {
		if (this.energy < 10) {
			System.out.println(this.name + "：疲れちゃって、これ以飛べないよ。");
		} else {
			System.out.println(this.name + "：飛んだよ。体力が10減った。最大体力が1増えた。");
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

