package pkg7syou;

public class VirtualPetGame {

	public static void main(String[] args) {
		VirtualDog taro = new VirtualDog("�^��", 100, 50);
		VirtualBird piyo = new VirtualBird("�s��", 60, 30);

		//�ړ��Ɛ������s�킹��
		
		//�܂��́A�^������B
		taro.move();		
		taro.sleep();
		
		//���Ƀs���B
		piyo.move();
		piyo.sleep();
		
		
		//���̃��[�e�B�[���i�������Q��j��o�^��������moveAndSleep()���\�b�h���쐬����
		taro.moveAndSleep();
		piyo.moveAndSleep();
	}
}
