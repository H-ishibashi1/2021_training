package jp.co.aforce.text;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car;
		car = new Car();
		
		//speedフィールドに値を代入する
//		car.speed = 80;
		
		//speedフィールドの値を参照する
//		System.out.println("スピード：" + car.speed);
		
		//引数に値を直接指定してspeedUpメソッドを呼び出す
//		car.speedUp(10);
//		System.out.println("スピード：" + car.speed);
		
		//引数に変数を指定してspeedUpメソッドを呼び出す
//		int newSpeed = 80;
//		car.speedUp(newSpeed);
//		System.out.println("スピード：" + car.speed);
		
		car.speedUp(40);
		car.speedDown(10);
		System.out.println("速度 ＝ " + car.getSpeed());
		
		//トラッククラス
		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);//Carクラスを継承したから使える
	}

}
