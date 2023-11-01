package chap3;
/*
 * 단항연산자 : 연산자의 피연산자가 한개인 수식
 * 증감연산자 : ++, --
 * 		++ : 변수에 저장된 값을 1 증가
 * 		-- : 변수에 저장된 값을 1 감소
 * 
 * 이항 연산자 :
 * 삼항 연산자
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x = 5, y = 5;
		x++; // x의 값을 1 증가
		y--; // y의 값을 1 감소
		System.out.printf("x=%d, y=%d\n", x, y);
		++x; // x의 값을 1 증가
		--y; // y의 값을 1 감소
		System.out.printf("x=%d, y=%d\n", x, y);
		x = y = 5;
		y = ++x; // x의 값을 1 증가하고 y에 대입
		System.out.printf("x=%d, y=%d\n", x, y);
		y = x++; // x의 값을 y에 대입하고 1 증가시킴
		System.out.printf("x=%d, y=%d\n", x, y);
		
		x = y = 5;
		System.out.println("x=" + x++); // x의 값을 출력하고 x의 값 증가
		System.out.println("x=" + ++x); // x의 값을 증가시키고 x의 값 출력
		System.out.println("y=" + y--); // y의 값을 출력하고 y의 값 감소
		System.out.println("y=" + --y); // y의 값을 감소시키고 y의 값 출력
	}
}
