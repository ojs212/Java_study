package chap11;
/*
 * String 클래스 : 정적인 문자열 (변경불가 문자열)
 *   1. + 연산 가능 / 문자열 <- 문자열 + 기본형
 *   2. 대입연산자로 객체 생성 가능
 *   3. final 클래스임 : 다른 클래스의 부모클래스 불가
 */
public class StringEx1 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 객체임");
		} else {
			System.out.println("s1과 s2는 다른 객체임");
		}
		if(s3 == s4) {
			System.out.println("s3과 s4는 같은 객체임");
		} else {
			System.out.println("s3과 s4는 다른 객체임");
		}
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같은 내용의 객체임");
		} else {
			System.out.println("s1과 s2는 다른 내용의 객체임");
		}
		if(s3.equals(s4)) {
			System.out.println("s3과 s4는 같은 내용의 객체임");
		} else {
			System.out.println("s3과 s4는 다른 내용의 객체임");
		}
	}

}
