package main;

// 부호 연산자
public class Ex1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = -20;
		System.out.println(+num1); // 양 => 양
		System.out.println(+num2 + "\n"); // 음 => 음

		// 그냥 수학적으로 생각하자

		System.out.println(-num1); // 양 => 음
		System.out.println(-num2); // 음 => 양

		System.out.println(num1); // 양 => 양
		System.out.println(num2); // 음 => 음

		// 부호연산자는 원본값에 영향이 없다.
		// 부호연산자는 값을 카피해서 사용한다.
		
		System.out.println(num1 + num2);
	}

}
