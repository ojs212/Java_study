package chap13;

import java.util.*;

/*
 * Vector 클래스
 *  - Collection 프레임워크 이전의 클래스
 *  - List 인터페이스의 구현클래스
 *  - 구버전에서의 메서드, List 메서드 공존
 */
public class ListEx2 {

	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3); // List 인터페이스의 메서드
		list.add(Math.PI);
		list.addElement(5.0); // Vector 클래스의 메서드 add() 메서드와 같은 기능
		System.out.println(list);
		// 요소의 위치 찾기
		double num = 5.0;
		int index = list.indexOf(num);
		if(index < 0) {
			System.out.println(num + "은 list에 없는 요소입니다.");
		} else {
			System.out.println(num + "의 위치:" + index);
		}
		// contains() : 요소의 존재 여부
		if(list.contains(num)) {
			System.out.println(num + "은 list 객체에 존재함");
		} else {
			System.out.println(num + "은 list 객체에 없음");
		}
		// 요소 제거하기
		System.out.println(list.get(0));
		list.remove(0.3);
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		System.out.println(list.get(0));
	}

}
