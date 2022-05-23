package ch14_lamda.method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {

	public static void main(String[] args) {
		IntBinaryOperator operator; // 2개의 int값을 받아서 연산 후에 하나의 값을 리턴하기 때문에
		
		// 정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator =Calculator::staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));

		// 인스턴스 메소드 참조
		Calculator obj = new Calculator();
		operator =(x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));
		
		operator = obj::instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));
	}

}


