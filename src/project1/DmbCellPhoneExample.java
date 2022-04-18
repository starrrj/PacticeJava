package project1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//1. 자식 DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
//		---
//		
//		//2. CellPhone으로부터 상속 받은 필드를 사용가능한가!? - 상속재산은 내꺼!!!
//		System.out.println("모델 : " + dmbCellPhone.model);
//		System.out.println("색상 : " + dmbCellPhone.color);
////		---
//		
//		//3. 자식클래스에만 선언된 DmbCellPhone의 필드의 사용 - 당연히 OK!!!
//		System.out.println("채널 : " + dmbCellPhone.channel);
//		
//		//4. 부모클래스인 CellPhone으로부터 상속 받은 메소드 호출 - 상속재산은 내꺼!!!
//		dmbCellPhone.powerOn();
//		dmbCellPhone.bell();
//		dmbCellPhone.sendVoice("여보세요");
////		dmbCellPhone.recive
//		
//		//5. 자식 클래스에만 선언된 의 메소드 호출
//		dmbCellPhone.turnOnDmb();
//		dmbCellPhone.changeChannelDmb(12);
//		dmbCellPhone.turnOffDmb();
		
	}
}
