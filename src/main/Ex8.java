package main;

public class Ex8 {

	public static void main(String[] args) {

		int momAge = 47;
		int dadAge = 48;

		String str = (momAge > dadAge) ? "아빠가 젋음" : "엄마가 젊음";

		System.out.println(str);

		
		char ch = (momAge > dadAge) ? 'f' : 'm';

		System.out.println(ch);

		int in = (momAge > dadAge) ? 1 : 2;

		System.out.println(in);
		
		boolean boom	 = (momAge > dadAge) ? true : false;

		System.out.println(boom);
		
	}
}
