package chap11;

import java.util.Date;
import java.util.Calendar;

// Calendar 클래스에 날짜 설정하기
public class CalendarEx2 {

	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		day.set(2023, (11 - 1),10); // 월 : 0~11
		System.out.printf("날짜:%d-%d-%d\n",
				day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1,day.get(Calendar.DATE));
		// 2023-12-31 ?요일 출력하기
		String w = " 일월화수목금토"; // 요일 : 1(일) ~ 7(토)
		day.set(2023, (12 - 1),31);
		System.out.printf("날짜:%d-%d-%d %c요일\n", 
				day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1, 
				day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		// Calendar 객체 <- Date 객체
		Date now = new Date();
		now.setTime(now.getTime() + (1000*60*60*24));
		System.out.println(now);
		day.setTime(now);
		System.out.printf("날짜:%d-%d-%d %c요일\n", 
				day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1, 
				day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		// Date 객체 <- Calendar 객체
		Date tday = new Date();
		// day.getTimeInMillis() : 1970 이후부터 현재까지 밀리초 리턴
		tday.setTime(day.getTimeInMillis());
		System.out.println(tday);
	}

}
