package project1; // 설계도 = 클래스

public class Calculator {
	
	//메소드  <----- 구분하기 위해 클래스 선언 후 2칸 뛰기, 메소드사이는 1칸씩 뛰기
	void powerOn() { 
		System.out.println("전원을 켭니다.");
	} // powerOn
	
	int plus(int x, int y) {
		int result = x + y;
		
		return result;
	} // plus
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		
		return result;
	} // divide
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	} // powerOff

	public double areaRectangle(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

} // end class
