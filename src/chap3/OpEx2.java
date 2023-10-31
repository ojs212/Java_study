package chap3;
/*
 * 단항연산자 : 논리부호연산자
 * 		! : !true == false, !false == true
 * 단항연산자 : 부호연산자
 * 		+ : 현재 부호를 유지 / 음수인 경우 음수를 유지
 * 		- : 현재 부호를 변경 / 음수인 경우 양수로 변경
 */
public class OpEx2 {
	public static void main(String[] args) {
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("5!=4 : " + (5 != 4)); // 비교연산자 != : 같지 않음
		System.out.println("5==4 : " + (5 == 4)); // 비교연산자 == : 같음
		
		// 부호연산자
		int x = -10; // 음수
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);
		x = 10; // 양수
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);
	}

}
