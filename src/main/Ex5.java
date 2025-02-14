package main;

// 비교 연산자
public class Ex5 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		boolean result = (x > y);
		System.out.println("x가 y보다 큰가요 컴퓨터씨? " + result);

		boolean result1 = (x >= y);
		System.out.println("x가 y보다 크거나 같나요 컴퓨터씨? " + result1);

		boolean result2 = (x < y);
		System.out.println("x가 y보다 작나요 컴퓨터씨? " + result2);

		boolean result3 = (x <= y);
		System.out.println("x가 y보다 작거나 같나요 컴퓨터씨? " + result3);

		boolean result4 = (x != y);
		System.out.println("x와 y가 같지 않나요 컴퓨터씨? " + result4);

		boolean result5 = (x == y);
		System.out.println("x와 y가 같나요 컴퓨터씨? " + result5);
	}

}
