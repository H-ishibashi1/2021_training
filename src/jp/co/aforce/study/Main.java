package jp.co.aforce.study;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog dog = new Dog();
		
//		dog.name = "ぽち";
//		dog.age = 3;
		
		dog.setName("ぽち");
		dog.setAge(3);
		
		dog.showProfile();
		
		//Cat用
		Cat cat = new Cat();
		
		cat.setName("たま");
		cat.setAge(2);
		
		cat.showProfile();
	}

}
