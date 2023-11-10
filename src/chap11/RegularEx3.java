package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111, 집:02-123-5678, 이메일:regular@aaa.bbb, 계좌번호:301-01-123456";
		/*
		 *  () : 그룹
		 *  0\\d{1,2} : 0으로 시작하고 숫자가 1개 또는 2개 / 0[0-9]{1,2}
		 *  \\d{3,4}  : 숫자 3개 또는 4개
		 *  \\d{4}    : 숫자 4개
		 */
		String telPattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("전화번호");
		// m.find() : 해당 문자열에서 패턴에 맞는 문자열을 찾기
		while(m.find()) {
			// m.group() : 그룹 호출  m.group(n) : 해당 순서의 그룹 호출
			System.out.println(++i + ":" + m.group() + " => " + m.group(1) + "," + m.group(2) +
					"," + m.group(3));
		}
		// 이메일 형식 데이터 찾기
		// \w : [0-9a-zA-Z]
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailPattern);
		m = p.matcher(source);
		i = 0;
		System.out.println("이메일");
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + " => " + m.group(1) + "," + m.group(2) +
					"," + m.group(3));
		}
		// 계좌번호 형식의 데이터 찾기
		String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
		p = Pattern.compile(accountPattern);
		m = p.matcher(source);
		i = 0;
		System.out.println("계좌번호");
		while(m.find()) {
			System.out.println(++i + ":" + m.group() + " => " + m.group(1) + "," + m.group(2) +
					"," + m.group(3));
		}
	}

}
