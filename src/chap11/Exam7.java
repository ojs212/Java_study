package chap11;
import java.util.*; // java.util 의 모든 클래스들은 패키지명 생략 가능
import java.text.*;
/*
 * 문자열로 두 개의 날짜를 입력받아 두 날짜 사이의 일수 계산하기
 * [결과]
 * 두 개의 날짜를 입력하세요(yyyy-MM-dd)
 * 2023-01-01 2023-01-03
 * 날짜 차이 : 2
 */
public class Exam7 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 날짜를 입력하세요(yyyy-MM-dd)");
		String s1 = sc.next();
		String s2 = sc.next();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sd.parse(s1);
		Date d2 = sd.parse(s2);
		long l = (d1.getTime() - d2.getTime()) / (1000*60*60*24);
		System.out.println(Math.abs(l));
		sc.close();
	}

}
