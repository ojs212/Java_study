package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력 받아 년월의 마지막일자와 요일 출력하기
 * Calendar 객체 이용하기
 */
public class Exam6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar ca = Calendar.getInstance();
		System.out.println("년도와 월을 입력하세요");
		int y = sc.nextInt();
		int m = sc.nextInt();
		ca.set(y, m-1, 1);
		int n = ca.getActualMaximum(Calendar.DATE);
		ca.set(y, m-1, n);
		String w = " 일월화수목금토";
		System.out.printf("%d-%d-%d %c요일", ca.get(Calendar.YEAR), ca.get(Calendar.MONTH)+1, 
				ca.get(Calendar.DATE), w.charAt(ca.get(Calendar.DAY_OF_WEEK)));
		
		sc.close();
	}

}
