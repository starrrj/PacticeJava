package ch18_network.domain;

import java.io.Serializable;
import lombok.Data;



// Mission Critical Business Data 저장용도의 자바빈즈 클래스 생성
// 아래의 규칙을 지키는 클래스를, 특별히 "자바빈즈(JavaBeans)" 클래스라 부르고.
// 이 자바빈즈 클래스는 아주 중요한 비지니스데이터를 저장하는 용도임.
//
// 규칙:
// 1) private 접근제한자로 필드를 선언한다. 	(필수)
// 2) 모든 필드에 대해서, 각 필드의 getter 메소드와 setter 메소드를 갖는다. 	(필수)
// 3) 기본 생성자가 반드시 존재해야 된다. 		(필수)
// 4) implements Serializable					(선택)
//
// 만일 클래스가 자바빈즈 클래스라면, 필드(객체의 속성)와는 다른
// "프로퍼티(Property)"라는 가상의 개념이 생긴다!(필드와 비슷)
// "프로퍼티" = 'get'을 빼거나, 'set'을 빼고, Camel 기법을 취소한 이름이 탄생

// 필드 : String name ==> setName() ==> 'set'제거 ==> 'Name' ==> 'name'
@Data
public class Member implements Serializable {
	private static final long serialVersionUID = 1;
	
	private Integer id;
	private String name;
	private Integer age;
} // end class
