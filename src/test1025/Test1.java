package test1025;
/*
1.   ch 변수의  문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
[결과]
A : a
b : B
1 : 21
- :기타문자
    
*/
public class Test1 {
	public static void main(String[] args) {
		char ch = '5';
		if (ch <= 'Z' && ch >= 'A') {
			System.out.println(ch + " : " + (ch += 32));
		} else if (ch <= 'z' && ch >= 'a') {
			System.out.println(ch + " : " +(ch -= 32));
		} else if (ch <= '9' && ch >= '0') {		
			System.out.println(ch + " : " + ((int)ch + (20 - 48))); //'0'의 코드값 48
		} else {
			System.out.println(ch + " : 기타문자");
		}
	}
}