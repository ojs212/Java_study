package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스 객체 : 반복자 (Collection 요소들을 반복호출 / 향상된 for문과 비슷
 *  Collection 객체는 Iterator 객체로 변환이 가능 : iterator() 메서드 이용
 *  주요메서드
 *   boolean hasNext() : 조회 대상 객체 존재 여부
 *   Object next()     : 조회 대상 객체 리턴
 *   void remove()     : 조회된 객체 제거 / 반드시 next() 실행 이후에 호출 가능
 *   
 * Enumeration 인터페이스 : Iterator 반복자 이전에 사용되던 반복자(구버전)
 *                     Collection 프레임워크 이전에 사용 -> Vector, Hashtable
 *  주요메서드
 *   boolean hasMoreElement() : 조회 대상 객체 존재 여부
 *   Object nextElement()     : 조회 대상 객체 리턴
 */
public class IteratorEx1 {

	public static void main(String[] args) {
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i=1; i<=5; i++) {
			list.add(i + 10); // [11,12,13,14,15]
			set.add(i * 10); // [10,20,30,40,50]
		}
		it = list.iterator(); // Iterator 객체 <- List 객체
		print(it);
		it = set.iterator(); // Iterator 객체 <- Set 객체
		print(it);
		System.out.println("print() 이후의 list:" + list);
		System.out.println("print() 이후의 set:" + set);
	}
	private static void print(Iterator<Integer> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove(); // 한개의 요소 제거 it.next() 이후에 호출되어야 함
		}
	}

}
