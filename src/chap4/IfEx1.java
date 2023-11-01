package chap4;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 60) { // if 조건문
			System.out.println("합격입니다."); // 조건문의 결과가 참인 경우만 실행
		} 
		if(score >= 60) {
			System.out.println("축하합니다.");
		} else {
			System.out.println("다음 기회에.");
		}
		// 점수별 학점 출력하기
		if(score >= 90 ) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else if(score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		scan.close();
	}
		
}
