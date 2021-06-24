package jp.co.aforce.text;

public class Car {
	//スピードを保存するフィールド
	private int speed;
	
	//スピードを取得するメソッド
	int getSpeed() {
		return this.speed;
	}
	
	//スピードを上げるメソッド
	void speedUp(int value) {
		if(value < 0) {
			return;
		}
		this.speed += value;
		if(this.speed >= 180) {
			this.speed = 180;
		}
		
	}
	
	//スピードを下げるメソッド
	void speedDown(int value) {
		this.speed -= value;
		if(value < 0) {
			return;
		}
		this.speed -= value;
		if(this.speed <= -15) {
			this.speed = -15;
		}
	}
}
