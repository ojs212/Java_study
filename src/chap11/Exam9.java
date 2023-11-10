package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 점수의 총점과 평균 출력하기
public class Exam9 {

	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		String[] pattern = data.split("\\W*,\\W*");
		Pattern p = Pattern.compile("\\d{2,3}");
		int sum = 0, cnt = 0;
		for(String a : pattern) {
			Matcher m = p.matcher(a);
			if(m.matches()) {
				System.out.print(a + ",");
				sum += Integer.parseInt(a);
				cnt++;
			}
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/(double)cnt);
		
		Matcher m = p.matcher(data);
		while(m.find()) {
			System.out.print(m.group() + " ");
		}
	}

}
