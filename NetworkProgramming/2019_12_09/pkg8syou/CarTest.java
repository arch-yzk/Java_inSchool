package pkg8syou;

class Car{
		int speed;
		
		void speedUp() {
			if(speed < 80)	speed++;
		}
		void speedDown() {
			if(speed>0)	speed--;
		}
	
}
public class CarTest {

	public static void main(String[] args) {
		
		//車のインスタンス生成
		Car car = new Car();
		
		//スピードを30にセット
		car.speed = 30;
		

	}

}
