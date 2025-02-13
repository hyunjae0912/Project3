package main;

//산술 연산자 계산과정
public class Ex4 {

	public static void main(String[] args) {

		// 성적 구하기
		int math = 93;
		int eng = 70;

		// 총점과 평균 구하기
		int sum = math + eng;
		double avg = sum / 2.0;
		System.out.println(sum);
		System.out.println(avg);
		
		
		int a = 0;
		
		a+=10;
		// 위 아래 계산식은 같은 의미이다.
		a = a + 10;

	}

}
