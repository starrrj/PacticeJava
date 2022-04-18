package project1;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor   // 타입선언부에 붙여야함
//@AllArgsConstructor
public class CellPhone {
	// 1. 고유속성 필드
	String model;
	String color;
	
	
	// 생성자 -> 자바 컴바일러의 default constructor
	public CellPhone()
		{System.out.println("CellPhone() invoked");}

	public CellPhone(String model) {
		System.out.println("CellPhone(model) invoked");
		
		this.model = model;
		}
	
	public CellPhone(String model, String color) {
		System.out.println("CellPhone(model,color) invoked");
		
		this.model = model;
		this.color = color;
		}
//	public CellPhone() {
//		;;
//	} // default constructor
	
 	// 메소드
	void  powerOn() {System.out.println("전원을 켭니다.");}
	void  powerOff() {System.out.println("전원을 끕니다.");}
	
	void  bell() {System.out.println("벨이 울립니다.");}
	
	void  sendVoice(String message) {System.out.println("자기 : " + message);}
	void  receiveVoice(String message) {System.out.println("상대방 : " + message);}
	
	void  hangUp() {System.out.println("전화를 끊습니다.");}

}
