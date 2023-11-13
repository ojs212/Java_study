package chap13;
import java.util.*;
/*
 * List 객체 정렬하기
 *   : 요소의 자료형이 Comparable 인터페이스의 구현 클래스여야함
 *   
 * Comparable 인터페이스 : compareTo() 추상메서드를 가짐 -> 객체의 기본 정렬방식을 구현
 * 
 * 정렬관련 인터페이스
 * 1. Comparable : 요소의 기본 정렬 방식을 설정
 *                 int compareTo(Object o) 추상메서드
 *                 양수리턴 : 현재객체 뒤쪽
 *                 음수리턴 : 현재객체 앞쪽
 * 2. Comparator : 기본정렬방식과 무관하게 다른 정렬 방식을 설정
 *                 동적으로 정렬방식 설정
 *                 Collections.sort(List, Comparator)
 *                 int compare(Object o1, Object o2)
 *                 양수리턴 : o2 객체를 앞쪽
 *                 음수리턴 : o1 객체를 앞쪽
 *    Comparator.reverseOrder() : 기본정렬방식의 역순으로 정렬
 *                                Comparator 인터페이스의 static 메서드                
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value) {
		this.value = value;
	}
	public String toString() {
		return value + "";
	}
	@Override
	public int compareTo(Data d) { // 기본정렬방식
		return value - d.value; // 오름차순정렬
//      return d.value - value;    내림차순정렬		
	}
}
class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	public String toString() {
		return value + ""; 
	}
}
public class ListEx3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a"); list1.add("c"); list1.add("d");
		list1.add("b"); list1.add("f");
		Collections.sort(list1);
		System.out.println(list1);
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(3)); list2.add(new Data(2)); list2.add(new Data(1));
		System.out.println(list2);
		Collections.sort(list2); 
		System.out.println(list2);
		// Comparator.reverseOrder() : 정렬방식을 반대로 처리
		Collections.sort(list2,Comparator.reverseOrder()); 
		System.out.println(list2);
		System.out.println("Data2 객체 정렬하기");
		
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(2)); list3.add(new Data2(3)); list3.add(new Data2(1));
		Comparator<Data2> c = new Comparator<>() {
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o1.value - o2.value;
			}
		};
		Collections.sort(list3, c);
		System.out.println(list3);
		// 역순으로 정렬하기
		Collections.sort(list3, new Comparator<Data2>() {
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o2.value - o1.value;
			}
		});
		System.out.println(list3);
		// 람다방식으로 정렬하기 : 오름차순 정렬
		Collections.sort(list3, (d1,d2)->d1.value - d2.value);
		System.out.println(list3);
	}

}
