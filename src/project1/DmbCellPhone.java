package project1;

import lombok.AllArgsConstructor; // 모든필드를 매개변수를 생성해주되 상속관계까지 고려X
import lombok.NoArgsConstructor;

@AllArgsConstructor
//@NoArgsConstructor
public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	
	//2. 매개변수가 있는 생성자 생성자
	DmbCellPhone(String model, String color, int channel) {  // model, color 매개변수 상속
		// super() 로 부모객체의 생성자를 호출해보자!!!
//		super();	// 부모생성자가 매개변수없을 때 . 의존하지마라 원칙을 까먹게된다.
		// OK. 생성자 가장 처음에 호출해줘야한다. 그래야 부모가 완전해지고 그다음 자식이 완전해짐
		// 부모객체가 매개변수가 있는 생성자라면 부모 생성자의 매개변수를 입력해주고 !! 자식 생성
		
		super(model, color);  // -> null로 초기화
		
		System.out.println("DmbCellPhone(model, color, channel) invoked");
		
//		this.model = model;		 super를 사용하는 것이 정석!! 여기서 할 경우 부모클래스는 초기화 X
//		this.color = color;		부모것도 받아서 super로 부모객체도 초기화 해야함. 초기화가아님 값을바꾼것
		this.channel = channel;
		
		// super키워드를 출력해보자!!!
		System.out.println("\t 1. this: " + this);
//		System.out.println("\t 2. super: " + super); 
		// Syntax error on token "super", invalid Expression. 출력불가
		
//		super(); // NO. 첫 줄에만 가능. 아래쪽 줄에서는 안됨. 
//		           자식객체가 생성되기전에 부모객체가 생성되기때문
		
	} // constructor
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	} // turnOnDmb
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	} //changeChannelDmb
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	} // turnOffDmb
	
} // end class
