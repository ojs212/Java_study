package chap13;
import java.util.*;
/*
 * TreeSet 예제 : 정렬 / 중복불가
 * Set의 하위인터페이스 SortedSet 인터페이스의 구현 클래스
 */
public class SetEx3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>();
//		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dzzzz"); set.add("dZZZZ");
		set.add("elev"); set.add("fan"); set.add("flower");
		System.out.println(set);
		System.out.println("from:" + from + ",to:" + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" + from + ",to:" + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		System.out.println("기존의 set 객체로 생성하기");
		TreeSet<String> set2 = new TreeSet<>(set);
		System.out.println(set2);
		System.out.println("역순 정렬방식으로 set 객체 생성");
		// Comparator.reverseOrder() : 기본정렬방식을 역순으로 바꿈
		set2 = new TreeSet<>(Comparator.reverseOrder()); // 내림차순 정렬
		set2.add("abc"); set2.add("alien");
		set2.add("bat"); set2.add("azz");
		set2.add("car"); set2.add("Car");
		set2.add("disc"); set2.add("dance");
		set2.add("dzzzz"); set2.add("dZZZZ");
		set2.add("elev"); set2.add("fan"); set2.add("flower");
		System.out.println(set2);
		// set.descendingSet() : set 객체의 역순
		System.out.println(set.descendingSet());
		// set 객체를 대소문자 구분없이 정렬하여 출력
		Set<String> set3 = new TreeSet<>((s1, s2) ->s1.compareToIgnoreCase(s2));
		set3.add("abc"); set3.add("alien");
		set3.add("bat"); set3.add("azz");
		set3.add("Car"); set3.add("car");
		set3.add("disc"); set3.add("dance");
		set3.add("dzzzz"); set3.add("dZZZZ");
		set3.add("elev"); set3.add("fan"); set3.add("flower");
		set3.add("A"); set3.add("a"); // A == a 같은 객체로 인식함
		System.out.println(set3);
		System.out.println("a".compareToIgnoreCase("A"));
	}

}
