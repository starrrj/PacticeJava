package project1;

public class Sample12 {

	public static void main(String[] args) {
		String name = "Star";
		
		int age = 23;
		double weight = 48.2;
		double hight = 167.5;
		
		String result = String.format( "1. name: %s", name );
		System.out.println(result);
		
		result = String.format("2. age: %s", age);
		System.out.println(result);

		result = String.format("3. weight: %s", weight);
		System.out.println(result);
		
		result = String.format(
				">>>name: %s, age: %s, weight: %s, hight: %s"
				, name, age, weight, hight);

//		---
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 배열의 각 원소의 값을 하나의 문자열로 출력하라!!
		
		result = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
		System.out.println(result);
		
		
		
//		for(int i : arr[i])
//		System.out.println(String.format(arr));

	}

}
