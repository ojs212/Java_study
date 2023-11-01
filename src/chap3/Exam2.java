package chap3;

import java.util.Scanner;

/*
 * 키보드에서 초를 입력받아 몇시간 몇분 몇초 인지 출력하기
 * 1. Scanner 객체 생성
 * 2. int second = scan.nextInt()
 * 3. 시 : second / 3600
 * 4. 분 : (second % 3600) / 60
 * 5. 초 : second % 60
 * [결과]
 * 초를 입력하세요
 * 3662
 * 1시간 1분 2초
 */
public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int sec = scan.nextInt();
		System.out.println((sec / 3600) + "시간 " + ((sec % 3600) / 60) + "분 " + (sec % 60) + "초 ");
		scan.close();
	}
}
