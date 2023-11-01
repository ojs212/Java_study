package chap6;
/*
 * 메서드 오버로딩 : 메서드의 다형성
 * 	1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존자 할 수 있다.
 * 	2. 단 매개변수 목록이 달라야 한다. (자료형기준->갯수, 형, 순서)
 */
class Math2 {
	int a=100;
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	/* 매개변수 목록이 다른 경우는 자료형 기준임. 매개변수명이 다르다고 오버로딩되지 않는다
	int add(int x) {
		System.out.print("1:");
		return a+x;
	}
	*/
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}
public class OverloadingEx1 {

	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("번"));
		System.out.println(m.add(10L));
		System.out.println(m.add(10F));
//		System.out.println(m.add(new int[1])); // 오류발생. add(int[]) 메서드가 없음
	}

}
