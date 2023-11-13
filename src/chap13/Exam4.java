package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국 = 서울, 캐나다 = 오타와, 영국 = 런던 값을 저장하는 HashMap 객체 map 이름으로 생성하기
 * 2. 화면에서 나라이름을 입력받아 수도 출력하기 / 종료 입력시까지 계속 입력받기
 *    => 등록된 나라가 아닌 경우 : 등록된 나라가 아닙니다
 * 3. 등록된 나라가 아닌 경우  수도를 입력받아 map 등록하기
 *    => 프로그램 종료 전 map에 등록된 내용 출력하기
 */
public class Exam4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름을 입력하세요(종료: 종료)");
			String s = sc.next();
			if(s.equals("종료")) {
				break;
			}
			if(map.get(s) == null) {
				System.out.println(s + " : 등록된 나라가 아닙니다. " + s + "의 수도를 입력하세요");
				String s2 = sc.next();
				map.put(s, s2);
			} else {
				System.out.println(map.get(s));
			}
		}
		for(Map.Entry<String, String> a : map.entrySet()) {
			System.out.println(a);
		}
		sc.close();
	}

}
