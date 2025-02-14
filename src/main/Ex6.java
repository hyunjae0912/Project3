package main;

// 논리 연산자
public class Ex6 {

	public static void main(String[] args) {

		// and 연산자 (그리고)
		boolean b = (5 > 0) && (10 > 0);

		System.out.println(b);
		// boolean result = 1 && 10; // 논리연산자는 숫자로 계산 x

		boolean b1 = (5 > 0) && (10 < 0);
		// true false
		System.out.println(b1 + "\n\n");

		// or 연산자 (또는)
		boolean b2 = (5 > 0) || (10 > 0);
		System.out.println(b2);

		boolean b3 = (5 > 0) || (10 < 0);
		System.out.println(b3);

		boolean b4 = (5 < 0) || (10 < 0);
		System.out.println(b4 + "\n\n");

		// not 연산자 (아닌)
		boolean b5 = !(5 > 0);
		boolean b6 = !true;
		boolean b7 = !false;

		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
	}

}
