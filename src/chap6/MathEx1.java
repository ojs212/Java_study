package chap6;
/*
 * 멤버메서드(함수, Function)
 * 
 *   메서드 구성
 *   [접근제어자][제어자] 리턴타입 메서드명 (매개변수 목록) -> 선언부
 *   { 		문장들...		 }                    -> 구현부
 *   
 *   리턴타입 : 메서드 종료 후 전달되는 값의 자료형을 선언부에 기술
 *           void인 경우 전달되는 값이 없음
 *   매개변수 : 메서드 호출 시 필요한 값의 목록 (자료형 변수명,자료형 변수명,...)
 *   
 *   return 예약어 : 메서드 종료.
 *       리턴타입이 void인 경우 생략 가능 메서드 끝에 }가 메서드 종료
 *       리턴타입이 void가 아닌 경우 생략 불가
 *                            return 리턴값;
 *                            리턴값은 리턴타입과 같거나 리턴타입으로 자동형변환이 되는 경우
 */
class Math1 {
	int add1(int a, int b) {
		return a+b;
	}
	long add2(int a, int b) {
		return a+b; //int형 -> long형 자동형변환
	}
	void add3(int a, int b) {
		System.out.println(a+b);
		return; // 함수 종료 / 리턴타입이 void 인 경우 마지막의 return문장 생략 가능
	}
}
public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println("add1(10, 20) = " + a1);
		long a2 = m1.add2(10, 20);
		System.out.println("add2(10, 20) = " + a2);
//		double a3 = m1.add3(10, 20); 리턴타입이 void 이므로 대입 불가
		m1.add3(10, 20);
	}

}
