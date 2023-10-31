package test1027;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println("숫자만 입력하세요");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] arr = {value};
		int num = 0;
		for(int i=0; i<arr[0].length(); i++) {
			num = value.charAt(i) - '0';
			if(num < 0 || num > 9) {
				System.out.println(value + " : 숫자가 아닙니다.");
				break;
			} else if(i == arr[0].length()-1) {
				System.out.println(value + " : 숫자 입니다.");
			}
		}
		sc.close();
	}
}