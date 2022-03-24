package oop_Ex;

abstract class Player {	 // 추상클래스 (미완성클래스, 미완성설계도)
	abstract void play(int pos); // 추상메서드(미완성 메서드)
	abstract void stop();		 // 추상메서드(선언부만 있고 구현부{}가 없는 메서드)
}


// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos+"위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
 }


public class PlayerTest {

	public static void main(String[] args) {
//		palyer p = new Player(); // 추상클래스의 객체를 생성
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); // 다형성
		ap.play(100);
		ap.stop();
	}
}
