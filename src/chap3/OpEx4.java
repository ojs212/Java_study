package chap3;
/*
 * 이항연산자 : 비교연산자 -> 결과는 boolean
 * 이항연산자 : 논리연산자 -> &&(AND), ||(OR)
 * 		T && T -> T
 * 		T && F -> F
 * 		F && T -> F
 * 		F && F -> T
 * 		-> && 조건의 앞쪽의 결과가 false 인 경우 전체 결과값은 false임
 * 			뒷 부분의 연산을 수행하지 않는다.
 * 
 * 		T || T -> T
 * 		T || F -> T
 * 		F || T -> T
 * 		F || F -> F
 * 		-> || 조건의 앞쪽의 결과가 true 인 경우 전체 결과값은 true임
 * 			뒷 부분의 연산을 수행하지 않는다.
 */
public class OpEx4 {
	public static void main(String[] args) {
		int x = 1, y = 1;
		// %b : boolean 값 출력
		System.out.printf("%d == %d : %b\n", x, y, (x == y));
		System.out.printf("%d != %d : %b\n", x, y, (x != y));
		System.out.printf("%d > %d : %b\n", x, y, (x > y));
		System.out.printf("%d >= %d : %b\n", x, y, (x >= y));
		
		// 논리 연산자
		System.out.println("x == 1 && y == 1 : " + (x == 1 && y == 1));
		System.out.println("x == 1 && y == 2 : " + (x == 1 && y == 2));
		System.out.println("x == 1 || y == 2 : " + (x == 1 || y == 2));
		System.out.println("x == 2 || y == 2 : " + (x == 2 || y == 2));
		
		String str = null;
		if(str == null || str.equals("")) 
			System.out.println("str 변수에 값이 없음");
//		str = "";
//		if(str == null | str.equals(""))
			System.out.println("str 변수에 값이 없음");
		
	}
}
