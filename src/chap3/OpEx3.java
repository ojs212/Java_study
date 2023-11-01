package chap3;
/*
 * 이항연산자 : 산술연산자
 * 	+ : 덧셈
 * 	- : 뺄셈
 * 	* : 곱셈
 * 	/ : 나눗셈
 * 	% : 나머지
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.printf("%d + %d = %d\n", x, y, (x + y));
		System.out.printf("%d - %d = %d\n", x, y, (x - y));
		System.out.printf("%d * %d = %d\n", x, y, (x * y));
		System.out.printf("%d / %d = %d\n", x, y, (x / y)); // int <- int / int
		System.out.printf("%d %% %d = %d\n", x, y, (x % y));
		
		//부호가 다른 경우의 나누기
		System.out.println(10 / 8); // 1
		System.out.println(-10 / 8); // -1
		System.out.println(10 / -8); // -1
		System.out.println(-10 / -8); // 1
		
		//부호가 다른 경우의 나머지 (피제수의 부호를 따라감)
		System.out.println(10 % 8); // 2
		System.out.println(-10 % 8); // -2
		System.out.println(10 % -8); // 2
		System.out.println(-10 % -8); // -2
	}
}
