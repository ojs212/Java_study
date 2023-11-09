package chap11;
import java.util.Scanner;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 년도와 월을 입력 받아 년월의 마지막일자와 요일 출력하기
 */
public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int y = sc.nextInt();
		int m = sc.nextInt();
		String dstr = y + "-" + String.format("%02d", (m+1)) + "-01";
		System.out.println(dstr);
		Date d = null;
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse(dstr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		d.setTime(d.getTime() - (1000L*60*60*24));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(d));
		
		sc.close();
	}

}
