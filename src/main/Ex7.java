package main;

public class Ex7 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("더하기");
		x += 10;
		y = y + 10;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("빼기");
		x -= 5;
		y = y - 5;
		System.out.println(x);
		System.out.println(y);

		System.out.println("곱하기");
		x *= 2;
		y = y * 2;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("나누기");
		x /= 2;
		y = y / 2;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("나머지");
		x %= 2;
		y = y % 2;
		System.out.println(x);
		System.out.println(y);

	}

}
