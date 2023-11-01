package chap6;
/*
 * 생성자 예제
 * 생성자란 객체화시 호출되는 특별한 메서드
 * 생성자 없는 객체 생성은 불가함
 * 생성자의 기능 : 인스턴스 변수의 초기화를 담당
 * 생성자는 오버로딩이 가능함
 * 
 * 기본생성자 : 클래스 내부에 생성자를 구현하지 않으면 컴파일러가 추가해 주는 생성자
 * 
 * 생성자 구현방법
 * 1. 생성자의 이름은 클래스명과 같다
 * 2. 리턴타입이 없다. void도 기술하지 않는다
 */
class Number1 {
	int num;
//	public Number() {} //-> 기본생성자의 형태
}
class Number2 { // 생성자 구현 -> 기본생성자 제공 안됨
 
		int num;
		Number2(int n) {
		num = n;
	 
		}
}
public class ConstructorEx1 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 기능
		 * 1. 힙 영역에 메모리 할당
		 * 2. 기본값 초기화
		 * 3. 생성자 호출 -> 클래스 구현된 생성자 형태로 호출해야함
		 */
		Number2 n2 = new Number2(10);
		System.out.println("Number1.num:" + n1.num);
		System.out.println("Number2.num:" + n2.num);
	}
		
}

