package chap4;
/*
 * 	반복문 : 조건문의 결과가 참인 동안 문장들을 반복 수행
 * 
 * 	1. for(초기값;조건문;증감식) {
 * 		문장들;
 * 		}
 * 
 * 		for 구문 실행 순서
 *					 
 * 		초기값 -> 조건문 참  -> 문장들 -> 증갑식 -> 조건문(참, 거짓)
 * 					거짓 -> 반복문 종료
 * 
 * 	2. while(조건문) {
 *  	문장들;
 *  	}
 *  
 *  	while 구문 실행 순서
 *  
 *  	조건문 참 -> 문장들 -> 조건문(참, 거짓)
 *  		거짓 -> 반복문 종료
 *  
 *  3. do {
 *  	문장들
 *  	} while(조건문)
 *  
 *  	do while 구문 실행 순서
 *  
 *  	문장들 -> 조건문 참 -> 문장들 -> 조건문(참, 거짓)
 *  				거짓 -> 반복문 종료
 */
public class LoopEx1 {

	public static void main(String[] args) {
		// 1~5까지의 숫자를 출력하기
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		System.out.println("for 구문을 이용하여 1~5까지 출력");
		// i 변수는 for 구문 내부에서만 사용이 가능한 지역변수
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("while 구문을 이용하여 1~5까지 출력");
		int i = 10;
		while (i <= 5) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("i = " + i);
		System.out.println("do while 구문을 이용하여 1~5까지 출력");
		i = 10;
		do {
			System.out.print(i);
			i++;
		} while (i <= 5);
		System.out.println();
		System.out.println("i = " + i);
	}

}
