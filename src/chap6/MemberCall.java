package chap6;
/*
 *  클래스  - 변수     - 클래스변수
 *  			    - 인스턴스변수
 *        - 메서드    - 클래스메서드
 *                  - 인스턴스메서드
 *  클래스멤버  = 클래스변수 + 클래스메서드
 *  인스턴스멤버 = 인스턴스변수 + 인스턴스메서드
 *  
 *  클래스멤버에서 클래스멤버 호출 : 정상
 *  인스턴스멤버에서 인스턴스멤버 호출 : 정상
 *  인스턴스멤버에서 클래스멤버 호출 : 정상
 *  클래스멤버에서 인스턴스멤버 호출 : 직접호출 불가 -> 객체화 필요
 *  
 *  같은 멤버들간 클래스명, 참조변수명 등 생략 가능
 *  단 클래스멤버에서 인스턴스멤버 호출시 객체화 필요하므로 참조변수명 사용함
 */

public class MemberCall {
	static int cv1 = 10;
	static int cv2 = cv1; // 클래스변수 = 클래스변수정상
	int iv1 = 100;
	int iv2 = iv1; // 인스턴스변수 = 인스턴스변수 정상
	int iv3 = cv1; // 인스턴스변수 = 클래스변수 정상
//	static int cv3 = iv1; // 클래스변수 = 인스턴스변수 비정상
	static int cv3 = new MemberCall().iv1; // 클래스멤버에서 인스턴스멤버 호출시 객체화 필요
	void method1() { // 인스턴스메서드
		System.out.println("cv1 + cv2="+(cv1+cv2)); // 클래스변수 호출
		System.out.println("iv1 + iv2="+(iv1+iv2)); // 인스턴스변수 호출
	}
	static void method2() { // 클래스메서드
		System.out.println("cv1 + cv2="+(cv1+cv2)); //클래스변수 호출
//		System.out.println("iv1 + iv2="+(iv1+iv2)); // 인스턴스변수 호출 불가
		MemberCall m = new MemberCall();
		System.out.println("cv1 + cv2="+(m.iv1+m.iv2)); // 인스턴스변수 호출시 객체화 필요
	}
	void method3() { // 인스턴스메서드
		method1(); // 인스턴스메서드 호출
		method2(); // 클래스메서드 호출
	}
	static void method4() { // 클래스메서드
//		method1(); // 인스턴스메서드 호출 불가
		new MemberCall().method1(); // 인스턴스메서드 호출시 객체화 필요
		method2(); // 클래스메서드 호출	
	}
	public static void main(String[] args) {
		//method1 ~ mothod4 함수 호출하기
		MemberCall mbc = new MemberCall();
		mbc.method1();
		method2();
		mbc.method3();
		method4();
	}

}
