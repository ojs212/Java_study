package chap4;
/*
 * ch의 문자가 대문자/소문자/숫자/기타문자인지 출력하기
 * [결과]
 * A:대문자
 * 
 * [결과]
 * b:소문자
 * 
 * [결과]
 * 1:숫자
 * 
 * [결과]
 * -:기타문자
 * 
 * 대문자 범위 : ch >= 'A' && ch <= 'Z'
 * 소문자 범위 : ch >= 'a' && ch <= 'z'
 * 숫자 범위 : ch >= '0' && ch <= '9'
 * 그외 기타문자
 */
public class Exam2 {
	public static void main(String[] args) {
		//A:65 a:97
		char ch = '-';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " : 숫자");
		} else {	
			System.out.println(ch + " : 기타문자");
		}
		System.out.println("A : " + (int)'A');
		System.out.println("a : " + (int)'a');
		System.out.println("Z : " + (int)'Z');
		//대문자 + 32 -> 소문자 (코드값)
		System.out.println("A의 소문자 : " + (char)('A' + 32));
	}

}
