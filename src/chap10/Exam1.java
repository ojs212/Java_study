package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1. 화면에서 1~10 사이의 숫자를 입력받아서 숫자만큼 * 출력하기
 *    1~10 사이의 숫자가 아닌경우 예외 강제 발생시키고, 다시 숫자 입력받기
 * 2. 입력값이 숫자가 아닌 경우 InputMismatchException 예외가 발생함
 *    숫자만 가능합니다. 메세지 출력하고, 다시 숫자 입력받기
 */
public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10사이 숫자를 입력하세요");
		int num;
		while(true) {
			try {
				num = sc.nextInt();
				if (num < 1 || num > 10) {
					throw new Exception("숫자를 다시 입력하세요");
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("정수만 가능합니다");
				sc.next();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.print(num + ":");
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		} 
		System.out.println();
		sc.close();
	}
}
