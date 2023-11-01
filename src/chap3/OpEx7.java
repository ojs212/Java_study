package chap3;
/*
 * 대입 연산자 : =, +=, -=, *=, ...
 * 
 * lvalue(좌측변수) = rvalue(우측값, 변수, 수식)
 * 우측의 값을 좌측변수에 대입하여 저장하기
 */
public class OpEx7 {
	public static void main(String[] args) {
		int num = 100; // lvalue num 변수에 100을 대입 저장
		System.out.println(num);
		num += 10; // num = num + 10
		System.out.println(num);
		num -= 10; // num = num - 10
		System.out.println(num);
		num *= 5; // num = num * 5
		System.out.println(num);
		num /= 10; // num = num / num
		System.out.println(num);
		num %= 3; // num = num % 3
		System.out.println(num);
		num += 2 + 3; // num = num + (2 + 3)
		System.out.println(num);
		
		byte b = 1;
		b *= 2;
//		b = b * 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b *= 30;
	}

}
