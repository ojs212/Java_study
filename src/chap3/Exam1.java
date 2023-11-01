package chap3;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int x = 10;
		// ++ 연산자를 이용하여 x = 10 결과가 나오도록 프로그램 코딩하기
		// -- 연산자를 이용하여 x = 10 결과가 나오도록 프로그램 코딩하기
		System.out.println("x = " + x++);
		System.out.println("x = " + --x);
		
		// 화면에서 숫자를 입력받아 입력받은 수가 x=? 로 나오도록 코딩하기
		System.out.println("정수를 입력하세요");
		// System.in : 키보드입력 / 표준입력
		// new Scanner(System.in) : 키보드에서 데이터를 입력받기 위한 객체
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("x = " + x++);
		System.out.println("x = " + --x);
		scan.close();
	}
}
