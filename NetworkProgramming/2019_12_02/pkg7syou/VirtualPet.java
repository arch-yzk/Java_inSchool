package pkg7syou;

class VirtualPet {
	String name; // ���O
	int maxEnergy; // �ő�̗�
	int energy; // ���݂̗̑�

	VirtualPet(String name, int maxEnergy, int energy) {
		this.name = name;
		this.maxEnergy = maxEnergy;
		this.energy = energy;
	}

	void sleep() {
		System.out.println(this.name + "�F�悭�Q���B�̗͂��񕜂�����B");
		this.energy = this.maxEnergy; // ���݂̗̑͂̒l���ő�̗͂̒l�ɂ���
	}

	void printInfo() {
		System.out.println("[��ԏo��]");
		System.out.println("���O�F" + this.name);
		System.out.println("�ő�̗́F" + this.maxEnergy);
		System.out.println("�̗́F" + this.energy);
	}

	void move() {
	}

}

