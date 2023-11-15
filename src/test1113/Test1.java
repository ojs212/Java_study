package test1113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797
*** 복권 추첨 결과 ***
1등:797,
2등:404,611,
3등:6,123,945,  
 */
public class Test1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		Random r = new Random();
		while(set.size() < 6) {
			set.add(r.nextInt(1000) + 1);
		}
		List<Integer> draw = new ArrayList<>(set);
		List<Integer> li3 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();
		List<Integer> li1 = new Vector<>();
		li3.add(draw.get(5));
		li3.add(draw.get(4));
		li3.add(draw.get(3));
		li2.add(draw.get(2));
		li2.add(draw.get(1));
		li1.add(draw.get(0));
		System.out.println("3등 복권 추첨합니다");
		for(Integer a : li3) {
			System.out.println(a);
		}
		System.out.println("2등 복권 추첨합니다");
		for(Integer a : li2) {
			System.out.println(a);
		}
		System.out.println("1등 복권 추첨합니다");
		for(Integer a : li1) {
			System.out.println(a);
		}
		Collections.sort(li2);
		Collections.sort(li3);
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.println("1등:" + li1);
		System.out.println("2등:" + li2);
		System.out.println("3등:" + li3);
	}
}