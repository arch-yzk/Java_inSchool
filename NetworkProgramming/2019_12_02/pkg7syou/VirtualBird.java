package pkg7syou;


class VirtualBird extends VirtualPet {
    VirtualBird(String name, int maxEnergy, int energy) {
        super(name, maxEnergy, energy);
    }

    void move() {
		if (this.energy < 10) {
			System.out.println(this.name + "�F��ꂿ����āA����Ȕ�ׂȂ���B");
		} else {
			System.out.println(this.name + "�F��񂾂�B�̗͂�10�������B�ő�̗͂�1�������B");
			this.energy -= 10; // �̗͂�10����
			this.maxEnergy++; // �ő�̗͂�1������
		}
    }

	void moveAndSleep()
	{
		this.move();
		this.sleep();
	}
}

